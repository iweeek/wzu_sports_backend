package com.wzsport.mapper;

import com.wzsport.model.RunningActivityView;
import com.wzsport.model.RunningActivityViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface RunningActivityViewMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	long countByExample(RunningActivityViewExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int deleteByExample(RunningActivityViewExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity_view (end_running_sport_id, running_sport_id, ",
			"student_id, distance, ", "step_count, cost_time, ", "speed, step_per_second, ",
			"distance_per_step, target_finished_time, ", "start_time, kcal_consumed, ", "qualified, is_valid, ",
			"qualified_distance, qualified_cost_time, ", "min_cost_time, user_id, ", "class_id, university_id, ",
			"student_no, is_man, name, ", "ended_at, ended_by)",
			"values (#{endRunningSportId,jdbcType=BIGINT}, #{runningSportId,jdbcType=BIGINT}, ",
			"#{studentId,jdbcType=BIGINT}, #{distance,jdbcType=INTEGER}, ",
			"#{stepCount,jdbcType=SMALLINT}, #{costTime,jdbcType=INTEGER}, ",
			"#{speed,jdbcType=DECIMAL}, #{stepPerSecond,jdbcType=DECIMAL}, ",
			"#{distancePerStep,jdbcType=DECIMAL}, #{targetFinishedTime,jdbcType=INTEGER}, ",
			"#{startTime,jdbcType=TIMESTAMP}, #{kcalConsumed,jdbcType=INTEGER}, ",
			"#{qualified,jdbcType=BIT}, #{isValid,jdbcType=TINYINT}, ",
			"#{qualifiedDistance,jdbcType=INTEGER}, #{qualifiedCostTime,jdbcType=INTEGER}, ",
			"#{minCostTime,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, ",
			"#{classId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
			"#{studentNo,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, #{name,jdbcType=VARCHAR}, ",
			"#{endedAt,jdbcType=TIMESTAMP}, #{endedBy,jdbcType=TINYINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivityView record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int insertSelective(RunningActivityView record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	List<RunningActivityView> selectByExample(RunningActivityViewExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivityView record,
			@Param("example") RunningActivityViewExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_view
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivityView record,
			@Param("example") RunningActivityViewExample example);
}