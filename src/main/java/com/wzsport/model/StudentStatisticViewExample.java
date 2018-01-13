package com.wzsport.model;

import java.util.ArrayList;
import java.util.List;

public class StudentStatisticViewExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public StudentStatisticViewExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andClassNameIsNull() {
			addCriterion("class_name is null");
			return (Criteria) this;
		}

		public Criteria andClassNameIsNotNull() {
			addCriterion("class_name is not null");
			return (Criteria) this;
		}

		public Criteria andClassNameEqualTo(String value) {
			addCriterion("class_name =", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotEqualTo(String value) {
			addCriterion("class_name <>", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameGreaterThan(String value) {
			addCriterion("class_name >", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameGreaterThanOrEqualTo(String value) {
			addCriterion("class_name >=", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLessThan(String value) {
			addCriterion("class_name <", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLessThanOrEqualTo(String value) {
			addCriterion("class_name <=", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameLike(String value) {
			addCriterion("class_name like", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotLike(String value) {
			addCriterion("class_name not like", value, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameIn(List<String> values) {
			addCriterion("class_name in", values, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotIn(List<String> values) {
			addCriterion("class_name not in", values, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameBetween(String value1, String value2) {
			addCriterion("class_name between", value1, value2, "className");
			return (Criteria) this;
		}

		public Criteria andClassNameNotBetween(String value1, String value2) {
			addCriterion("class_name not between", value1, value2, "className");
			return (Criteria) this;
		}

		public Criteria andUniversityIdIsNull() {
			addCriterion("university_id is null");
			return (Criteria) this;
		}

		public Criteria andUniversityIdIsNotNull() {
			addCriterion("university_id is not null");
			return (Criteria) this;
		}

		public Criteria andUniversityIdEqualTo(Long value) {
			addCriterion("university_id =", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotEqualTo(Long value) {
			addCriterion("university_id <>", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdGreaterThan(Long value) {
			addCriterion("university_id >", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdGreaterThanOrEqualTo(Long value) {
			addCriterion("university_id >=", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdLessThan(Long value) {
			addCriterion("university_id <", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdLessThanOrEqualTo(Long value) {
			addCriterion("university_id <=", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdIn(List<Long> values) {
			addCriterion("university_id in", values, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotIn(List<Long> values) {
			addCriterion("university_id not in", values, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdBetween(Long value1, Long value2) {
			addCriterion("university_id between", value1, value2, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotBetween(Long value1, Long value2) {
			addCriterion("university_id not between", value1, value2, "universityId");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNull() {
			addCriterion("user_type is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull() {
			addCriterion("user_type is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(Boolean value) {
			addCriterion("user_type =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(Boolean value) {
			addCriterion("user_type <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(Boolean value) {
			addCriterion("user_type >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(Boolean value) {
			addCriterion("user_type >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(Boolean value) {
			addCriterion("user_type <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(Boolean value) {
			addCriterion("user_type <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<Boolean> values) {
			addCriterion("user_type in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<Boolean> values) {
			addCriterion("user_type not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(Boolean value1, Boolean value2) {
			addCriterion("user_type between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(Boolean value1, Boolean value2) {
			addCriterion("user_type not between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNull() {
			addCriterion("open_id is null");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNotNull() {
			addCriterion("open_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpenIdEqualTo(String value) {
			addCriterion("open_id =", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotEqualTo(String value) {
			addCriterion("open_id <>", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThan(String value) {
			addCriterion("open_id >", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
			addCriterion("open_id >=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThan(String value) {
			addCriterion("open_id <", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThanOrEqualTo(String value) {
			addCriterion("open_id <=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLike(String value) {
			addCriterion("open_id like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotLike(String value) {
			addCriterion("open_id not like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdIn(List<String> values) {
			addCriterion("open_id in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotIn(List<String> values) {
			addCriterion("open_id not in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdBetween(String value1, String value2) {
			addCriterion("open_id between", value1, value2, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotBetween(String value1, String value2) {
			addCriterion("open_id not between", value1, value2, "openId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudentIdEqualTo(Long value) {
			addCriterion("student_id =", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotEqualTo(Long value) {
			addCriterion("student_id <>", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThan(Long value) {
			addCriterion("student_id >", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("student_id >=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThan(Long value) {
			addCriterion("student_id <", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThanOrEqualTo(Long value) {
			addCriterion("student_id <=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIn(List<Long> values) {
			addCriterion("student_id in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotIn(List<Long> values) {
			addCriterion("student_id not in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdBetween(Long value1, Long value2) {
			addCriterion("student_id between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotBetween(Long value1, Long value2) {
			addCriterion("student_id not between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentNameIsNull() {
			addCriterion("student_name is null");
			return (Criteria) this;
		}

		public Criteria andStudentNameIsNotNull() {
			addCriterion("student_name is not null");
			return (Criteria) this;
		}

		public Criteria andStudentNameEqualTo(String value) {
			addCriterion("student_name =", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotEqualTo(String value) {
			addCriterion("student_name <>", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameGreaterThan(String value) {
			addCriterion("student_name >", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
			addCriterion("student_name >=", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLessThan(String value) {
			addCriterion("student_name <", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLessThanOrEqualTo(String value) {
			addCriterion("student_name <=", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameLike(String value) {
			addCriterion("student_name like", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotLike(String value) {
			addCriterion("student_name not like", value, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameIn(List<String> values) {
			addCriterion("student_name in", values, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotIn(List<String> values) {
			addCriterion("student_name not in", values, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameBetween(String value1, String value2) {
			addCriterion("student_name between", value1, value2, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNameNotBetween(String value1, String value2) {
			addCriterion("student_name not between", value1, value2, "studentName");
			return (Criteria) this;
		}

		public Criteria andStudentNoIsNull() {
			addCriterion("student_no is null");
			return (Criteria) this;
		}

		public Criteria andStudentNoIsNotNull() {
			addCriterion("student_no is not null");
			return (Criteria) this;
		}

		public Criteria andStudentNoEqualTo(String value) {
			addCriterion("student_no =", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotEqualTo(String value) {
			addCriterion("student_no <>", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoGreaterThan(String value) {
			addCriterion("student_no >", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
			addCriterion("student_no >=", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLessThan(String value) {
			addCriterion("student_no <", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLessThanOrEqualTo(String value) {
			addCriterion("student_no <=", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLike(String value) {
			addCriterion("student_no like", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotLike(String value) {
			addCriterion("student_no not like", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoIn(List<String> values) {
			addCriterion("student_no in", values, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotIn(List<String> values) {
			addCriterion("student_no not in", values, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoBetween(String value1, String value2) {
			addCriterion("student_no between", value1, value2, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotBetween(String value1, String value2) {
			addCriterion("student_no not between", value1, value2, "studentNo");
			return (Criteria) this;
		}

		public Criteria andIsManIsNull() {
			addCriterion("is_man is null");
			return (Criteria) this;
		}

		public Criteria andIsManIsNotNull() {
			addCriterion("is_man is not null");
			return (Criteria) this;
		}

		public Criteria andIsManEqualTo(Boolean value) {
			addCriterion("is_man =", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManNotEqualTo(Boolean value) {
			addCriterion("is_man <>", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManGreaterThan(Boolean value) {
			addCriterion("is_man >", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_man >=", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManLessThan(Boolean value) {
			addCriterion("is_man <", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManLessThanOrEqualTo(Boolean value) {
			addCriterion("is_man <=", value, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManIn(List<Boolean> values) {
			addCriterion("is_man in", values, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManNotIn(List<Boolean> values) {
			addCriterion("is_man not in", values, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManBetween(Boolean value1, Boolean value2) {
			addCriterion("is_man between", value1, value2, "isMan");
			return (Criteria) this;
		}

		public Criteria andIsManNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_man not between", value1, value2, "isMan");
			return (Criteria) this;
		}

		public Criteria andClassIdIsNull() {
			addCriterion("class_id is null");
			return (Criteria) this;
		}

		public Criteria andClassIdIsNotNull() {
			addCriterion("class_id is not null");
			return (Criteria) this;
		}

		public Criteria andClassIdEqualTo(Long value) {
			addCriterion("class_id =", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotEqualTo(Long value) {
			addCriterion("class_id <>", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdGreaterThan(Long value) {
			addCriterion("class_id >", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
			addCriterion("class_id >=", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdLessThan(Long value) {
			addCriterion("class_id <", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdLessThanOrEqualTo(Long value) {
			addCriterion("class_id <=", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdIn(List<Long> values) {
			addCriterion("class_id in", values, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotIn(List<Long> values) {
			addCriterion("class_id not in", values, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdBetween(Long value1, Long value2) {
			addCriterion("class_id between", value1, value2, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotBetween(Long value1, Long value2) {
			addCriterion("class_id not between", value1, value2, "classId");
			return (Criteria) this;
		}

		public Criteria andSignInCountIsNull() {
			addCriterion("sign_in_count is null");
			return (Criteria) this;
		}

		public Criteria andSignInCountIsNotNull() {
			addCriterion("sign_in_count is not null");
			return (Criteria) this;
		}

		public Criteria andSignInCountEqualTo(Long value) {
			addCriterion("sign_in_count =", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountNotEqualTo(Long value) {
			addCriterion("sign_in_count <>", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountGreaterThan(Long value) {
			addCriterion("sign_in_count >", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountGreaterThanOrEqualTo(Long value) {
			addCriterion("sign_in_count >=", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountLessThan(Long value) {
			addCriterion("sign_in_count <", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountLessThanOrEqualTo(Long value) {
			addCriterion("sign_in_count <=", value, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountIn(List<Long> values) {
			addCriterion("sign_in_count in", values, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountNotIn(List<Long> values) {
			addCriterion("sign_in_count not in", values, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountBetween(Long value1, Long value2) {
			addCriterion("sign_in_count between", value1, value2, "signInCount");
			return (Criteria) this;
		}

		public Criteria andSignInCountNotBetween(Long value1, Long value2) {
			addCriterion("sign_in_count not between", value1, value2, "signInCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountIsNull() {
			addCriterion("running_activity_count is null");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountIsNotNull() {
			addCriterion("running_activity_count is not null");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountEqualTo(Long value) {
			addCriterion("running_activity_count =", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountNotEqualTo(Long value) {
			addCriterion("running_activity_count <>", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountGreaterThan(Long value) {
			addCriterion("running_activity_count >", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountGreaterThanOrEqualTo(Long value) {
			addCriterion("running_activity_count >=", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountLessThan(Long value) {
			addCriterion("running_activity_count <", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountLessThanOrEqualTo(Long value) {
			addCriterion("running_activity_count <=", value, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountIn(List<Long> values) {
			addCriterion("running_activity_count in", values, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountNotIn(List<Long> values) {
			addCriterion("running_activity_count not in", values, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountBetween(Long value1, Long value2) {
			addCriterion("running_activity_count between", value1, value2, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityCountNotBetween(Long value1, Long value2) {
			addCriterion("running_activity_count not between", value1, value2, "runningActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountIsNull() {
			addCriterion("area_activity_count is null");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountIsNotNull() {
			addCriterion("area_activity_count is not null");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountEqualTo(Long value) {
			addCriterion("area_activity_count =", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountNotEqualTo(Long value) {
			addCriterion("area_activity_count <>", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountGreaterThan(Long value) {
			addCriterion("area_activity_count >", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountGreaterThanOrEqualTo(Long value) {
			addCriterion("area_activity_count >=", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountLessThan(Long value) {
			addCriterion("area_activity_count <", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountLessThanOrEqualTo(Long value) {
			addCriterion("area_activity_count <=", value, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountIn(List<Long> values) {
			addCriterion("area_activity_count in", values, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountNotIn(List<Long> values) {
			addCriterion("area_activity_count not in", values, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountBetween(Long value1, Long value2) {
			addCriterion("area_activity_count between", value1, value2, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityCountNotBetween(Long value1, Long value2) {
			addCriterion("area_activity_count not between", value1, value2, "areaActivityCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountIsNull() {
			addCriterion("running_activity_qualified_count is null");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountIsNotNull() {
			addCriterion("running_activity_qualified_count is not null");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountEqualTo(Long value) {
			addCriterion("running_activity_qualified_count =", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountNotEqualTo(Long value) {
			addCriterion("running_activity_qualified_count <>", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountGreaterThan(Long value) {
			addCriterion("running_activity_qualified_count >", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountGreaterThanOrEqualTo(Long value) {
			addCriterion("running_activity_qualified_count >=", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountLessThan(Long value) {
			addCriterion("running_activity_qualified_count <", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountLessThanOrEqualTo(Long value) {
			addCriterion("running_activity_qualified_count <=", value, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountIn(List<Long> values) {
			addCriterion("running_activity_qualified_count in", values, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountNotIn(List<Long> values) {
			addCriterion("running_activity_qualified_count not in", values, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountBetween(Long value1, Long value2) {
			addCriterion("running_activity_qualified_count between", value1, value2, "runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andRunningActivityQualifiedCountNotBetween(Long value1, Long value2) {
			addCriterion("running_activity_qualified_count not between", value1, value2,
					"runningActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountIsNull() {
			addCriterion("area_activity_qualified_count is null");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountIsNotNull() {
			addCriterion("area_activity_qualified_count is not null");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountEqualTo(Long value) {
			addCriterion("area_activity_qualified_count =", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountNotEqualTo(Long value) {
			addCriterion("area_activity_qualified_count <>", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountGreaterThan(Long value) {
			addCriterion("area_activity_qualified_count >", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountGreaterThanOrEqualTo(Long value) {
			addCriterion("area_activity_qualified_count >=", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountLessThan(Long value) {
			addCriterion("area_activity_qualified_count <", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountLessThanOrEqualTo(Long value) {
			addCriterion("area_activity_qualified_count <=", value, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountIn(List<Long> values) {
			addCriterion("area_activity_qualified_count in", values, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountNotIn(List<Long> values) {
			addCriterion("area_activity_qualified_count not in", values, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountBetween(Long value1, Long value2) {
			addCriterion("area_activity_qualified_count between", value1, value2, "areaActivityQualifiedCount");
			return (Criteria) this;
		}

		public Criteria andAreaActivityQualifiedCountNotBetween(Long value1, Long value2) {
			addCriterion("area_activity_qualified_count not between", value1, value2, "areaActivityQualifiedCount");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student_statistic_view
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wzsport_student_statistic_view
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 15 15:06:04 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}