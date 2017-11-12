package com.wzsport.mapper;

import com.wzsport.model.StudentSportConsumeStatistic;
import com.wzsport.model.StudentSportConsumeStatisticExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface StudentSportConsumeStatisticMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	long countByExample(StudentSportConsumeStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int deleteByExample(StudentSportConsumeStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Delete({ "delete from wzsport_student_sport_consume_statistic", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Insert({ "insert into wzsport_student_sport_consume_statistic (user_id, student_id, ",
			"kcal_consumed, cost_time, ", "class_id, university_id, ", "student_no, is_man, name, ",
			"avatar_url, sport_date)", "values (#{userId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{kcalConsumed,jdbcType=BIGINT}, #{costTime,jdbcType=BIGINT}, ",
			"#{classId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
			"#{studentNo,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, #{name,jdbcType=VARCHAR}, ",
			"#{avatarUrl,jdbcType=VARCHAR}, #{sportDate,jdbcType=DATE})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(StudentSportConsumeStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int insertSelective(StudentSportConsumeStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	List<StudentSportConsumeStatistic> selectByExample(StudentSportConsumeStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Select({ "select", "id, user_id, student_id, kcal_consumed, cost_time, class_id, university_id, ",
			"student_no, is_man, name, avatar_url, sport_date", "from wzsport_student_sport_consume_statistic",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.StudentSportConsumeStatisticMapper.BaseResultMap")
	StudentSportConsumeStatistic selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByExampleSelective(@Param("record") StudentSportConsumeStatistic record,
			@Param("example") StudentSportConsumeStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByExample(@Param("record") StudentSportConsumeStatistic record,
			@Param("example") StudentSportConsumeStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByPrimaryKeySelective(StudentSportConsumeStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Update({ "update wzsport_student_sport_consume_statistic", "set user_id = #{userId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "kcal_consumed = #{kcalConsumed,jdbcType=BIGINT},",
			"cost_time = #{costTime,jdbcType=BIGINT},", "class_id = #{classId,jdbcType=BIGINT},",
			"university_id = #{universityId,jdbcType=BIGINT},", "student_no = #{studentNo,jdbcType=VARCHAR},",
			"is_man = #{isMan,jdbcType=BIT},", "name = #{name,jdbcType=VARCHAR},",
			"avatar_url = #{avatarUrl,jdbcType=VARCHAR},", "sport_date = #{sportDate,jdbcType=DATE}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(StudentSportConsumeStatistic record);

	@Select("SELECT t1.* FROM\n" +
			"(\n" +
			"		SELECT user_id, avatar_url, student_id, student_name AS name, class_id,university_id,\n" +
			"		student_no, is_man, SUM(cost_time) AS cost_time, SUM(kcal_consumed) AS kcal_consumed, date(sport_time) AS sport_date\n" +
			"		FROM \n" +
			"		(\n" +
			"			SELECT \n" +
			"			tUser.id AS user_id,\n" +
			"			tUser.avatar_url AS avatar_url, \n" +
			"			student.id AS student_id, \n" +
			"			student.name AS student_name,\n" +
			"			student.class_id AS class_id,\n" +
			"			student.university_id AS university_id,\n" +
			"			student.student_no AS student_no,\n" +
			"			student.is_man AS is_man,\n" +
			"			runningAct.cost_time AS cost_time,\n" +
			"			runningAct.kcal_consumed AS kcal_consumed,\n" +
			"			runningAct.start_time AS sport_time\n" +
			"			FROM wzsport_student AS student  \n" +
			"			RIGHT JOIN (SELECT student_id,SUM(cost_time) AS cost_time, SUM(kcal_consumed) AS kcal_consumed,start_time\n" +
			"							 FROM wzsport_running_activity \n" +
			"							WHERE date(start_time) >= date(#{start}) and date(start_time) <= date(#{end})\n" +
			"								AND is_valid = 1 \n" +
			"						 GROUP BY student_id, date(start_time)) runningAct  \n" +
			"			ON student.id = runningAct.student_id\n" +
			"			LEFT JOIN wzsport_user AS tUser \n" +
			"			ON student.user_id = tUser.id\n" +
			"		UNION ALL \n" +
			"			SELECT \n" +
			"			tUser.id AS user_id,\n" +
			"			tUser.avatar_url AS avatar_url, \n" +
			"			student.id AS student_id, \n" +
			"			student.name AS student_name,\n" +
			"			student.class_id AS class_id,\n" +
			"			student.university_id AS university_id,\n" +
			"			student.student_no AS student_no,\n" +
			"			student.is_man AS is_man,\n" +
			"			areaAct.cost_time AS cost_time,\n" +
			"			areaAct.kcal_consumed AS kcal_consumed,\n" +
			"			areaAct.start_time AS sport_time\n" +
			"			FROM wzsport_student AS student  \n" +
			"			RIGHT JOIN (SELECT student_id,SUM(cost_time) AS cost_time, SUM(kcal_consumed) AS kcal_consumed,start_time\n" +
			"							 FROM wzsport_area_activity \n" +
			"								WHERE date(start_time) >= date(#{start}) and date(start_time) <= date(#{end})\n" +
			"							 GROUP BY student_id,date(start_time)) areaAct  \n" +
			"			ON student.id = areaAct.student_id\n" +
			"			LEFT JOIN wzsport_user AS tUser \n" +
			"			ON student.user_id = tUser.id\n" +
			"		) t\n" +
			"		GROUP BY student_id,date(sport_time)\n" +
			") t1\n" +
			"LEFT JOIN wzsport_student_sport_consume_statistic t2 \n" +
			"ON t1.student_id = t2.student_id AND date(t1.sport_date) = date(t2.sport_date)\n" +
			"WHERE t2.student_id IS NULL")
	List<StudentSportConsumeStatistic> getStudentSportConsumeStatisticList(@Param("start") Date date,@Param("end") Date end);

}