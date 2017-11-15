package com.wzsport.mapper;

import com.wzsport.model.UserRole;
import com.wzsport.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	long countByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int deleteByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	@Delete({ "delete from wzsport_user_role", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	@Insert({ "insert into wzsport_user_role (user_id, role_id)",
			"values (#{userId,jdbcType=BIGINT}, #{roleId,jdbcType=BIGINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int insertSelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	List<UserRole> selectByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	@Select({ "select", "id, user_id, role_id", "from wzsport_user_role", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.UserRoleMapper.BaseResultMap")
	UserRole selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	int updateByPrimaryKeySelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user_role
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	@Update({ "update wzsport_user_role", "set user_id = #{userId,jdbcType=BIGINT},",
			"role_id = #{roleId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(UserRole record);
}