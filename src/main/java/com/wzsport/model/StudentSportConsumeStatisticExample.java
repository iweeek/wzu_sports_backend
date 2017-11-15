package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class StudentSportConsumeStatisticExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public StudentSportConsumeStatisticExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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

		public Criteria andKcalConsumedIsNull() {
			addCriterion("kcal_consumed is null");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedIsNotNull() {
			addCriterion("kcal_consumed is not null");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedEqualTo(Long value) {
			addCriterion("kcal_consumed =", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotEqualTo(Long value) {
			addCriterion("kcal_consumed <>", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedGreaterThan(Long value) {
			addCriterion("kcal_consumed >", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedGreaterThanOrEqualTo(Long value) {
			addCriterion("kcal_consumed >=", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedLessThan(Long value) {
			addCriterion("kcal_consumed <", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedLessThanOrEqualTo(Long value) {
			addCriterion("kcal_consumed <=", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedIn(List<Long> values) {
			addCriterion("kcal_consumed in", values, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotIn(List<Long> values) {
			addCriterion("kcal_consumed not in", values, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedBetween(Long value1, Long value2) {
			addCriterion("kcal_consumed between", value1, value2, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotBetween(Long value1, Long value2) {
			addCriterion("kcal_consumed not between", value1, value2, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNull() {
			addCriterion("cost_time is null");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNotNull() {
			addCriterion("cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andCostTimeEqualTo(Long value) {
			addCriterion("cost_time =", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotEqualTo(Long value) {
			addCriterion("cost_time <>", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThan(Long value) {
			addCriterion("cost_time >", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThanOrEqualTo(Long value) {
			addCriterion("cost_time >=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThan(Long value) {
			addCriterion("cost_time <", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThanOrEqualTo(Long value) {
			addCriterion("cost_time <=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeIn(List<Long> values) {
			addCriterion("cost_time in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotIn(List<Long> values) {
			addCriterion("cost_time not in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeBetween(Long value1, Long value2) {
			addCriterion("cost_time between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotBetween(Long value1, Long value2) {
			addCriterion("cost_time not between", value1, value2, "costTime");
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

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNull() {
			addCriterion("avatar_url is null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNotNull() {
			addCriterion("avatar_url is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlEqualTo(String value) {
			addCriterion("avatar_url =", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotEqualTo(String value) {
			addCriterion("avatar_url <>", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThan(String value) {
			addCriterion("avatar_url >", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
			addCriterion("avatar_url >=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThan(String value) {
			addCriterion("avatar_url <", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
			addCriterion("avatar_url <=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLike(String value) {
			addCriterion("avatar_url like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotLike(String value) {
			addCriterion("avatar_url not like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIn(List<String> values) {
			addCriterion("avatar_url in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotIn(List<String> values) {
			addCriterion("avatar_url not in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlBetween(String value1, String value2) {
			addCriterion("avatar_url between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotBetween(String value1, String value2) {
			addCriterion("avatar_url not between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andSportDateIsNull() {
			addCriterion("sport_date is null");
			return (Criteria) this;
		}

		public Criteria andSportDateIsNotNull() {
			addCriterion("sport_date is not null");
			return (Criteria) this;
		}

		public Criteria andSportDateEqualTo(Date value) {
			addCriterionForJDBCDate("sport_date =", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("sport_date <>", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateGreaterThan(Date value) {
			addCriterionForJDBCDate("sport_date >", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("sport_date >=", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateLessThan(Date value) {
			addCriterionForJDBCDate("sport_date <", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("sport_date <=", value, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateIn(List<Date> values) {
			addCriterionForJDBCDate("sport_date in", values, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("sport_date not in", values, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("sport_date between", value1, value2, "sportDate");
			return (Criteria) this;
		}

		public Criteria andSportDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("sport_date not between", value1, value2, "sportDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student_sport_consume_statistic
	 * @mbg.generated  Wed Nov 15 11:00:50 CST 2017
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
     * This class corresponds to the database table wzsport_student_sport_consume_statistic
     *
     * @mbg.generated do_not_delete_during_merge Fri Sep 01 16:57:08 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}