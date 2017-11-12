package com.wzsport.mapper;

import com.wzsport.model.WechatUser;
import com.wzsport.model.WechatUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface WechatUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	long countByExample(WechatUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int deleteByExample(WechatUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Delete({ "delete from wzsport_wechat_user", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Insert({ "insert into wzsport_wechat_user (user_id, open_id, ", "nickname, sex, province, ", "city, headimgurl, ",
			"unionid)", "values (#{userId,jdbcType=BIGINT}, #{openId,jdbcType=VARCHAR}, ",
			"#{nickname,jdbcType=VARCHAR}, #{sex,jdbcType=TINYINT}, #{province,jdbcType=VARCHAR}, ",
			"#{city,jdbcType=VARCHAR}, #{headimgurl,jdbcType=VARCHAR}, ", "#{unionid,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(WechatUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int insertSelective(WechatUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	List<WechatUser> selectByExample(WechatUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Select({ "select", "id, user_id, open_id, nickname, sex, province, city, headimgurl, unionid",
			"from wzsport_wechat_user", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.WechatUserMapper.BaseResultMap")
	WechatUser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByExampleSelective(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByExample(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	int updateByPrimaryKeySelective(WechatUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_wechat_user
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	@Update({ "update wzsport_wechat_user", "set user_id = #{userId,jdbcType=BIGINT},",
			"open_id = #{openId,jdbcType=VARCHAR},", "nickname = #{nickname,jdbcType=VARCHAR},",
			"sex = #{sex,jdbcType=TINYINT},", "province = #{province,jdbcType=VARCHAR},",
			"city = #{city,jdbcType=VARCHAR},", "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
			"unionid = #{unionid,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(WechatUser record);
}