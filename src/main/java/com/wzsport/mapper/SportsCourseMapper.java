package com.wzsport.mapper;

import com.wzsport.model.SportsCourse;
import com.wzsport.model.SportsCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SportsCourseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	long countByExample(SportsCourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	int deleteByExample(SportsCourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	@Delete({ "delete from wzsport_sports_course", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	@Insert({ "insert into wzsport_sports_course (university_id, school_year, ", "term, year, subject_number, ",
			"course_name, teacher_name, ", "course_time, student_no, ", "student_name, is_man, ",
			"major_name, college_name)", "values (#{universityId,jdbcType=BIGINT}, #{schoolYear,jdbcType=VARCHAR}, ",
			"#{term,jdbcType=BIT}, #{year,jdbcType=VARCHAR}, #{subjectNumber,jdbcType=VARCHAR}, ",
			"#{courseName,jdbcType=VARCHAR}, #{teacherName,jdbcType=VARCHAR}, ",
			"#{courseTime,jdbcType=VARCHAR}, #{studentNo,jdbcType=VARCHAR}, ",
			"#{studentName,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, ",
			"#{majorName,jdbcType=VARCHAR}, #{collegeName,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(SportsCourse record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	int insertSelective(SportsCourse record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	List<SportsCourse> selectByExample(SportsCourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	@Select({ "select", "id, university_id, school_year, term, year, subject_number, course_name, teacher_name, ",
			"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.SportsCourseMapper.BaseResultMap")
	SportsCourse selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	int updateByExampleSelective(@Param("record") SportsCourse record, @Param("example") SportsCourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	int updateByExample(@Param("record") SportsCourse record, @Param("example") SportsCourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	int updateByPrimaryKeySelective(SportsCourse record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	@Update({ "update wzsport_sports_course", "set university_id = #{universityId,jdbcType=BIGINT},",
			"school_year = #{schoolYear,jdbcType=VARCHAR},", "term = #{term,jdbcType=BIT},",
			"year = #{year,jdbcType=VARCHAR},", "subject_number = #{subjectNumber,jdbcType=VARCHAR},",
			"course_name = #{courseName,jdbcType=VARCHAR},", "teacher_name = #{teacherName,jdbcType=VARCHAR},",
			"course_time = #{courseTime,jdbcType=VARCHAR},", "student_no = #{studentNo,jdbcType=VARCHAR},",
			"student_name = #{studentName,jdbcType=VARCHAR},", "is_man = #{isMan,jdbcType=BIT},",
			"major_name = #{majorName,jdbcType=VARCHAR},", "college_name = #{collegeName,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(SportsCourse record);

	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{id,jdbcType=BIGINT} group by teacher_name" })
	List<SportsCourse> getTeacherName(Long id);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{id,jdbcType=BIGINT} group by school_year" })
	List<SportsCourse> getSchoolYear(Long id);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{id,jdbcType=BIGINT} group by course_name" })
	List<SportsCourse> getCourseName(Long id);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{id,jdbcType=BIGINT} group by course_time" })
	List<SportsCourse> getCourseTime(Long id);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{universityId,jdbcType=BIGINT} ", "and school_year = #{schoolYear,jdbcType=VARCHAR} ",
		"and term = #{term,jdbcType=BIT} group by teacher_name" })
	List<SportsCourse> getTeacherNameBySchoolYearAndTerm(SportsCourse record);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{universityId,jdbcType=BIGINT} and school_year = #{schoolYear,jdbcType=VARCHAR} "
		+ "and term = #{term,jdbcType=BIT} and teacher_name = #{teacherName,jdbcType=VARCHAR} group by course_name" })
	List<SportsCourse> getCourseNameBySchoolYearAndTermAndTeacherName(SportsCourse record);
	
	@Select({ "select", "id, university_id, school_year, term, subject_number, course_name, teacher_name, ",
		"course_time, student_no, student_name, is_man, major_name, college_name", "from wzsport_sports_course ",
		"where university_id = #{universityId,jdbcType=BIGINT} and school_year = #{schoolYear,jdbcType=VARCHAR} "
		+ "and term = #{term,jdbcType=BIT} and teacher_name = #{teacherName,jdbcType=VARCHAR} "
		+ "and course_name = #{courseName,jdbcType=VARCHAR} group by course_time" })
	List<SportsCourse> getCourseTimeBySchoolYearAndTermAndTeacherNameAndCourseName(SportsCourse record);
}