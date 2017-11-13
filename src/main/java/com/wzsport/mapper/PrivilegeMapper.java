package com.wzsport.mapper;

import com.wzsport.model.Privilege;
import com.wzsport.model.PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface PrivilegeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	long countByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	int deleteByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	@Delete({ "delete from wzsport_privilege", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	@Insert({ "insert into wzsport_privilege (table_name)", "values (#{tableName,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	int insertSelective(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	List<Privilege> selectByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	@Select({ "select", "id, table_name", "from wzsport_privilege", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.PrivilegeMapper.BaseResultMap")
	Privilege selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	int updateByPrimaryKeySelective(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_privilege
	 * @mbg.generated  Mon Nov 13 09:41:05 CST 2017
	 */
	@Update({ "update wzsport_privilege", "set table_name = #{tableName,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Privilege record);
}