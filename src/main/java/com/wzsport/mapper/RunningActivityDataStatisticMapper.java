package com.wzsport.mapper;

import com.wzsport.model.AreaActivityDataStatistic;
import com.wzsport.model.RunningActivityDataStatistic;
import com.wzsport.model.RunningActivityDataStatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningActivityDataStatisticMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	long countByExample(RunningActivityDataStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	int deleteByExample(RunningActivityDataStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	@Delete({ "delete from wzsport_running_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	@Insert({ "insert into wzsport_running_activity_data_statistic (student_id, activity_id, ",
			"location_total_count, speed_against, ", "distance_per_step_against)",
			"values (#{studentId,jdbcType=BIGINT}, #{activityId,jdbcType=BIGINT}, ",
			"#{locationTotalCount,jdbcType=INTEGER}, #{speedAgainst,jdbcType=INTEGER}, ",
			"#{distancePerStepAgainst,jdbcType=INTEGER})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivityDataStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	int insertSelective(RunningActivityDataStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	List<RunningActivityDataStatistic> selectByExample(RunningActivityDataStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	@Select({ "select", "id, student_id, activity_id, location_total_count, speed_against, distance_per_step_against",
			"from wzsport_running_activity_data_statistic", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
	RunningActivityDataStatistic selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	int updateByExampleSelective(@Param("record") RunningActivityDataStatistic record,
			@Param("example") RunningActivityDataStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	int updateByExample(@Param("record") RunningActivityDataStatistic record,
			@Param("example") RunningActivityDataStatisticExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	int updateByPrimaryKeySelective(RunningActivityDataStatistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data_statistic
	 * @mbg.generated  Tue Jan 09 00:16:34 CST 2018
	 */
	@Update({ "update wzsport_running_activity_data_statistic", "set student_id = #{studentId,jdbcType=BIGINT},",
			"activity_id = #{activityId,jdbcType=BIGINT},",
			"location_total_count = #{locationTotalCount,jdbcType=INTEGER},",
			"speed_against = #{speedAgainst,jdbcType=INTEGER},",
			"distance_per_step_against = #{distancePerStepAgainst,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivityDataStatistic record);

	@Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against \n" + 
        "from wzsport_running_activity_data_statistic as s\n" + 
        "where s.student_id = #{studentId,jdbcType=BIGINT}\n"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectByStudentId(@Param("studentId") Long studentId);
    
    /**
     * 违背速度比例大于
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (speed_against / location_total_count) as speed_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id =  #{studentId, jdbcType=BIGINT}\n" + 
        "and speed_against_percent >= #{speedAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectBySpeedGreaterThan(@Param("studentId") Long studentId, 
            @Param("speedAgainstPercent") Double speedAgainstPercent);
    
    /**
     * 违背速度比例小于
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (speed_against / location_total_count) as speed_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id =  #{studentId, jdbcType=BIGINT}\n" + 
        "and speed_against_percent < #{speedAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectBySpeedLessThan(@Param("studentId") Long studentId, 
            @Param("speedAgainstPercent") Double speedAgainstPercent);
    
    /**
     * 违背速度比例介于两�?�之�??
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (speed_against / location_total_count) as speed_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id = #{studentId, jdbcType=BIGINT} \n" + 
        " and speed_against_percent between #{speedAgainstPercent, jdbcType=DECIMAL} and " +
        "  #{anotherSpeedAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectBySpeedBetween(@Param("studentId") Long studentId, 
            @Param("speedAgainstPercent") Double speedAgainstPercent,
            @Param("anotherSpeedAgainstPercent") Double anotherSpeedAgainstPercent
            );
    
    /**
     * 违背步幅比例大于
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (distance_per_step_against / location_total_count) as distance_per_step_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id =  #{studentId, jdbcType=BIGINT}\n" + 
        "and distance_per_step_against_percent >= #{distancePerStepAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectByDistancePerStepGreaterThan(@Param("studentId") Long studentId, 
            @Param("distancePerStepAgainstPercent") Double distancePerStepAgainstPercent);
    
    /**
     * 违背步幅比例小于
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (distance_per_step_against / location_total_count) as distance_per_step_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id =  #{studentId, jdbcType=BIGINT}\n" + 
        "and distance_per_step_against_percent < #{distancePerStepAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectByDistancePerStepLessThan(@Param("studentId") Long studentId, 
            @Param("distancePerStepAgainstPercent") Double distancePerStepAgainstPercent);
    
    /**
     * 违背步幅比例介于两�?�之�??
     */
    @Select({
        "select s.id, s.student_id, s.activity_id, s.location_total_count, s.speed_against, s.distance_per_step_against from (\n" + 
        "select *, (distance_per_step_against / location_total_count) as distance_per_step_against_percent \n" + 
        "from wzsport_running_activity_data_statistic) as s\n" + 
        "where s.student_id = #{studentId, jdbcType=BIGINT} \n" + 
        " and distance_per_step_against_percent between #{distancePerStepAgainstPercent, jdbcType=DECIMAL} and " +
        "  #{anotherDistancePerStepAgainstPercent, jdbcType=DECIMAL}"
    })
    @ResultMap("com.wzsport.mapper.RunningActivityDataStatisticMapper.BaseResultMap")
    List<RunningActivityDataStatistic> selectByDistancePerStepBetween(@Param("studentId") Long studentId, 
            @Param("distancePerStepAgainstPercent") Double distancePerStepAgainstPercent,
            @Param("anotherDistancePerStepAgainstPercent") Double anotherDistancePerStepAgainstPercent
            );
    
}