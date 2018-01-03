package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Term;
import com.wzsport.model.TermExample;

public interface TermMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    long countByExample(TermExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int deleteByExample(TermExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Delete({ "delete from wzsport_term", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Insert({ "insert into wzsport_term (university_id, name, ", "start_date, end_date, created_at, ", "updated_at)",
            "values (#{universityId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
            "#{startDate,jdbcType=DATE}, #{endDate,jdbcType=DATE}, #{createdAt,jdbcType=TIMESTAMP}, ",
            "#{updatedAt,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Term record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int insertSelective(Term record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    List<Term> selectByExample(TermExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Select({ "select", "id, university_id, name, start_date, end_date, created_at, updated_at", "from wzsport_term",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.TermMapper.BaseResultMap")
    Term selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") Term record, @Param("example") TermExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByExample(@Param("record") Term record, @Param("example") TermExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    int updateByPrimaryKeySelective(Term record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_term
     * @mbg.generated  Wed Jan 03 20:51:15 CST 2018
     */
    @Update({ "update wzsport_term", "set university_id = #{universityId,jdbcType=BIGINT},",
            "name = #{name,jdbcType=VARCHAR},", "start_date = #{startDate,jdbcType=DATE},",
            "end_date = #{endDate,jdbcType=DATE},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
            "updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Term record);
}