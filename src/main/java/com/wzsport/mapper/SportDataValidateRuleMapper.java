package com.wzsport.mapper;

import com.wzsport.model.SportDataValidateRule;
import com.wzsport.model.SportDataValidateRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SportDataValidateRuleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    long countByExample(SportDataValidateRuleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int deleteByExample(SportDataValidateRuleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Delete({ "delete from wzsport_sport_data_validate_rule", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Insert({ "insert into wzsport_sport_data_validate_rule (distance_per_step, speed, ",
            "step_per_second, validate_mode)",
            "values (#{distancePerStep,jdbcType=DECIMAL}, #{speed,jdbcType=DECIMAL}, ",
            "#{stepPerSecond,jdbcType=DECIMAL}, #{validateMode,jdbcType=TINYINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(SportDataValidateRule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int insertSelective(SportDataValidateRule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    List<SportDataValidateRule> selectByExample(SportDataValidateRuleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Select({ "select", "id, distance_per_step, speed, step_per_second, validate_mode",
            "from wzsport_sport_data_validate_rule", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.SportDataValidateRuleMapper.BaseResultMap")
    SportDataValidateRule selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") SportDataValidateRule record,
            @Param("example") SportDataValidateRuleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByExample(@Param("record") SportDataValidateRule record,
            @Param("example") SportDataValidateRuleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByPrimaryKeySelective(SportDataValidateRule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_data_validate_rule
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Update({ "update wzsport_sport_data_validate_rule", "set distance_per_step = #{distancePerStep,jdbcType=DECIMAL},",
            "speed = #{speed,jdbcType=DECIMAL},", "step_per_second = #{stepPerSecond,jdbcType=DECIMAL},",
            "validate_mode = #{validateMode,jdbcType=TINYINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(SportDataValidateRule record);
}