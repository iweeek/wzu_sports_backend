package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.SignInMapper;
import com.wzsport.mapper.StudentUserViewMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;
import com.wzsport.model.SignInExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.StudentUserView;
import com.wzsport.model.StudentUserViewExample;
import com.wzsport.model.StudentUserViewExample.Criteria;
import com.wzsport.model.TeacherExample;
import com.wzsport.model.University;
import com.wzsport.model.UniversityExample;
import com.wzsport.model.UserExample;
import com.wzsport.service.TermService;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL大学类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class UniversityType {

	private static UniversityMapper universityMapper;
	private static CollegeMapper collegeMapper;
	private static TeacherMapper teacherMapper;
	private static UserMapper userMapper;
	private static StudentUserViewMapper studentUserViewMapper;
	private static SignInMapper signInMapper;
	private static TermService termService;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listField;

	private UniversityType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("University")
					.description("大学类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("大学名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("colleges")
							.description("该大学中的所有学院")
							.type(new GraphQLList(CollegeType.getType()))
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								CollegeExample collegeExample = new CollegeExample();
								collegeExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	List<College> collegeList = collegeMapper.selectByExample(collegeExample);
			                	return collegeList;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("teachersCount")
							.description("该大学中的教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	int teachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return teachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("maleTeachersCount")
							.description("该大学中的男性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(true);
			                	int maleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return maleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("femaleTeachersCount")
							.description("该大学中的女性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(false);
			                	int femaleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return femaleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
                            .name("activeStudentCount")
                            .description("该大学中的激活学生总数")
                            .type(Scalars.GraphQLInt)
                            .dataFetcher(environment ->  {
                                University university = environment.getSource();
                                
                                UserExample example = new UserExample();
                                example.createCriteria().andUniversityIdEqualTo(university.getId()).andOpenIdNotEqualTo("");
                                
                                int count = (int) userMapper.countByExample(example);
                                return count;
                            } )
                            .build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
                            .name("studentCount")
                            .description("该大学中的学生总数")
                            .type(Scalars.GraphQLInt)
                            .dataFetcher(environment ->  {
                                University university = environment.getSource();
                                
                                UserExample example = new UserExample();
                                example.createCriteria().andUniversityIdEqualTo(university.getId());
                                
                                int count = (int) userMapper.countByExample(example);
                                return count;
                            } )
                            .build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("kcalConsumptionRanking")
							.description("该校的学生累计热量消耗量排行榜")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(StudentKcalConsumptionType.getType())
									.name("StudentKcalConsumptionPage")
									.description("学生卡路里消耗量分页")
									.build())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	return universityMapper.getKcalCostedRanking(university.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("timeCostedRanking")
							.description("该校的学生累计锻炼时长排行榜")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(StudentTimeCostedType.getType())
									.name("StudentTimeCostedPage")
									.description("学生锻炼时间累计分页")
									.build())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	return universityMapper.getTimeCostedRanking(university.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTerm")
							.type(TermType.getType())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								return termService.getCurrentTerm(university.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition().name("studentUserInfo").description("所有学生基本信息")
							.argument(GraphQLArgument.newArgument().name("isUser").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("studentName").type(Scalars.GraphQLString).build())
							.argument(GraphQLArgument.newArgument().name("studentNo").type(Scalars.GraphQLString).build())
							.argument(GraphQLArgument.newArgument().name("className").type(Scalars.GraphQLString).build())
							.type(PageType.getPageTypeBuidler(StudentUserType.getType())
									.name("StudentUserInfoPage").description("学生基本信息分页").build())
							.dataFetcher(environment -> {
								List<StudentUserView> list = null;
								StudentUserViewExample example = new StudentUserViewExample();
								Criteria criteria = example.createCriteria();
								Long universityId = environment.getArgument("universityId");
								String studentName = environment.getArgument("studentName");
								if (studentName != null) {
									criteria.andStudentNameLike("%" + studentName + "%");
								}
								String studentNo = environment.getArgument("studentNo");
								if (studentNo != null) {
									criteria.andStudentNoLike("%" + studentNo + "%");
								}
								String className = environment.getArgument("className");
								if (className != null) {
									criteria.andClassNameLike("%" + className + "%");
								}
								int isUser = environment.getArgument("isUser");
								if (isUser == 0) {
									criteria.andUnivetsityIdEqualTo(universityId);
								}
								if (isUser == 1) {
									criteria.andUnivetsityIdEqualTo(universityId).andOpenIdNotEqualTo("");
								}
								if (isUser == 2) {
									criteria.andUnivetsityIdEqualTo(universityId).andOpenIdEqualTo("");
								}
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
								list = studentUserViewMapper.selectByExample(example);
								for(StudentUserView stu : list){
									SignInExample example1 = new SignInExample();
									example1.createCriteria().andNameEqualTo(stu.getStudentName());
									stu.setCardNum(signInMapper.selectByExample(example1).size());
									System.out.println(signInMapper.selectByExample(example1).size());
								}
								
								return list;
							}).build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	                .name("university")
	                .description("根据ID获取大学")
	                .argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	University university = universityMapper.selectByPrimaryKey(id);
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListField() {
		if (listField == null) {
			listField = GraphQLFieldDefinition.newFieldDefinition()
					.name("universities")
	                .description("获取大学列表")
	                .type(new GraphQLList(getType()))
					.dataFetcher(environment -> {
						UniversityExample example = new UniversityExample();
						example.createCriteria().andIdGreaterThan(0L);
						List<University> list = universityMapper.selectByExample(example);
						return list;
					}).build();
		}
		return listField;
	}
	
   @Autowired(required = true)
    public void setUserMapper(UserMapper userMapper) {
        UniversityType.userMapper = userMapper;
    }

	@Autowired(required = true)
	public void setCollegeMapper(CollegeMapper collegeMapper) {
		UniversityType.collegeMapper = collegeMapper;
	}
	
	@Autowired(required = true)
	public void setTeacherMapper(TeacherMapper teacherMapper) {
		UniversityType.teacherMapper = teacherMapper;
	}
	
	@Autowired(required = true)
	public void setUniversityMapper(UniversityMapper universityMapper) {
		UniversityType.universityMapper = universityMapper;
	}
	
	@Autowired(required = true)
	public void setTermService(TermService termService) {
		UniversityType.termService = termService;
	}
	
	@Autowired(required = true)
	public void setStudentUserViewMapper(StudentUserViewMapper studentUserViewMapper) {
		UniversityType.studentUserViewMapper = studentUserViewMapper;
	}
	
	@Autowired(required = true)
	public void setSignInMapper(SignInMapper signInMapper) {
		UniversityType.signInMapper = signInMapper;
	}
	
	
}
