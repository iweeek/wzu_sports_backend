package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportsCourseExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public SportsCourseExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
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

		public Criteria andSchoolYearIsNull() {
			addCriterion("school_year is null");
			return (Criteria) this;
		}

		public Criteria andSchoolYearIsNotNull() {
			addCriterion("school_year is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolYearEqualTo(String value) {
			addCriterion("school_year =", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearNotEqualTo(String value) {
			addCriterion("school_year <>", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearGreaterThan(String value) {
			addCriterion("school_year >", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearGreaterThanOrEqualTo(String value) {
			addCriterion("school_year >=", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearLessThan(String value) {
			addCriterion("school_year <", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearLessThanOrEqualTo(String value) {
			addCriterion("school_year <=", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearLike(String value) {
			addCriterion("school_year like", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearNotLike(String value) {
			addCriterion("school_year not like", value, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearIn(List<String> values) {
			addCriterion("school_year in", values, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearNotIn(List<String> values) {
			addCriterion("school_year not in", values, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearBetween(String value1, String value2) {
			addCriterion("school_year between", value1, value2, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andSchoolYearNotBetween(String value1, String value2) {
			addCriterion("school_year not between", value1, value2, "schoolYear");
			return (Criteria) this;
		}

		public Criteria andTermIsNull() {
			addCriterion("term is null");
			return (Criteria) this;
		}

		public Criteria andTermIsNotNull() {
			addCriterion("term is not null");
			return (Criteria) this;
		}

		public Criteria andTermEqualTo(Short value) {
			addCriterion("term =", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotEqualTo(Short value) {
			addCriterion("term <>", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermGreaterThan(Short value) {
			addCriterion("term >", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermGreaterThanOrEqualTo(Short value) {
			addCriterion("term >=", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermLessThan(Short value) {
			addCriterion("term <", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermLessThanOrEqualTo(Short value) {
			addCriterion("term <=", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermIn(List<Short> values) {
			addCriterion("term in", values, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotIn(List<Short> values) {
			addCriterion("term not in", values, "term");
			return (Criteria) this;
		}

		public Criteria andTermBetween(Short value1, Short value2) {
			addCriterion("term between", value1, value2, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotBetween(Short value1, Short value2) {
			addCriterion("term not between", value1, value2, "term");
			return (Criteria) this;
		}

		public Criteria andYearIsNull() {
			addCriterion("year is null");
			return (Criteria) this;
		}

		public Criteria andYearIsNotNull() {
			addCriterion("year is not null");
			return (Criteria) this;
		}

		public Criteria andYearEqualTo(String value) {
			addCriterion("year =", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotEqualTo(String value) {
			addCriterion("year <>", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThan(String value) {
			addCriterion("year >", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThanOrEqualTo(String value) {
			addCriterion("year >=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLessThan(String value) {
			addCriterion("year <", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLessThanOrEqualTo(String value) {
			addCriterion("year <=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLike(String value) {
			addCriterion("year like", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotLike(String value) {
			addCriterion("year not like", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearIn(List<String> values) {
			addCriterion("year in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotIn(List<String> values) {
			addCriterion("year not in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearBetween(String value1, String value2) {
			addCriterion("year between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotBetween(String value1, String value2) {
			addCriterion("year not between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberIsNull() {
			addCriterion("subject_number is null");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberIsNotNull() {
			addCriterion("subject_number is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberEqualTo(String value) {
			addCriterion("subject_number =", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberNotEqualTo(String value) {
			addCriterion("subject_number <>", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberGreaterThan(String value) {
			addCriterion("subject_number >", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberGreaterThanOrEqualTo(String value) {
			addCriterion("subject_number >=", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberLessThan(String value) {
			addCriterion("subject_number <", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberLessThanOrEqualTo(String value) {
			addCriterion("subject_number <=", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberLike(String value) {
			addCriterion("subject_number like", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberNotLike(String value) {
			addCriterion("subject_number not like", value, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberIn(List<String> values) {
			addCriterion("subject_number in", values, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberNotIn(List<String> values) {
			addCriterion("subject_number not in", values, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberBetween(String value1, String value2) {
			addCriterion("subject_number between", value1, value2, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andSubjectNumberNotBetween(String value1, String value2) {
			addCriterion("subject_number not between", value1, value2, "subjectNumber");
			return (Criteria) this;
		}

		public Criteria andCourseNameIsNull() {
			addCriterion("course_name is null");
			return (Criteria) this;
		}

		public Criteria andCourseNameIsNotNull() {
			addCriterion("course_name is not null");
			return (Criteria) this;
		}

		public Criteria andCourseNameEqualTo(String value) {
			addCriterion("course_name =", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotEqualTo(String value) {
			addCriterion("course_name <>", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameGreaterThan(String value) {
			addCriterion("course_name >", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
			addCriterion("course_name >=", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLessThan(String value) {
			addCriterion("course_name <", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLessThanOrEqualTo(String value) {
			addCriterion("course_name <=", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLike(String value) {
			addCriterion("course_name like", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotLike(String value) {
			addCriterion("course_name not like", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameIn(List<String> values) {
			addCriterion("course_name in", values, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotIn(List<String> values) {
			addCriterion("course_name not in", values, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameBetween(String value1, String value2) {
			addCriterion("course_name between", value1, value2, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotBetween(String value1, String value2) {
			addCriterion("course_name not between", value1, value2, "courseName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameIsNull() {
			addCriterion("teacher_name is null");
			return (Criteria) this;
		}

		public Criteria andTeacherNameIsNotNull() {
			addCriterion("teacher_name is not null");
			return (Criteria) this;
		}

		public Criteria andTeacherNameEqualTo(String value) {
			addCriterion("teacher_name =", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameNotEqualTo(String value) {
			addCriterion("teacher_name <>", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameGreaterThan(String value) {
			addCriterion("teacher_name >", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
			addCriterion("teacher_name >=", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameLessThan(String value) {
			addCriterion("teacher_name <", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameLessThanOrEqualTo(String value) {
			addCriterion("teacher_name <=", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameLike(String value) {
			addCriterion("teacher_name like", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameNotLike(String value) {
			addCriterion("teacher_name not like", value, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameIn(List<String> values) {
			addCriterion("teacher_name in", values, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameNotIn(List<String> values) {
			addCriterion("teacher_name not in", values, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameBetween(String value1, String value2) {
			addCriterion("teacher_name between", value1, value2, "teacherName");
			return (Criteria) this;
		}

		public Criteria andTeacherNameNotBetween(String value1, String value2) {
			addCriterion("teacher_name not between", value1, value2, "teacherName");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIsNull() {
			addCriterion("course_time is null");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIsNotNull() {
			addCriterion("course_time is not null");
			return (Criteria) this;
		}

		public Criteria andCourseTimeEqualTo(String value) {
			addCriterion("course_time =", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotEqualTo(String value) {
			addCriterion("course_time <>", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeGreaterThan(String value) {
			addCriterion("course_time >", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeGreaterThanOrEqualTo(String value) {
			addCriterion("course_time >=", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLessThan(String value) {
			addCriterion("course_time <", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLessThanOrEqualTo(String value) {
			addCriterion("course_time <=", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLike(String value) {
			addCriterion("course_time like", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotLike(String value) {
			addCriterion("course_time not like", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIn(List<String> values) {
			addCriterion("course_time in", values, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotIn(List<String> values) {
			addCriterion("course_time not in", values, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeBetween(String value1, String value2) {
			addCriterion("course_time between", value1, value2, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotBetween(String value1, String value2) {
			addCriterion("course_time not between", value1, value2, "courseTime");
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

		public Criteria andMajorNameIsNull() {
			addCriterion("major_name is null");
			return (Criteria) this;
		}

		public Criteria andMajorNameIsNotNull() {
			addCriterion("major_name is not null");
			return (Criteria) this;
		}

		public Criteria andMajorNameEqualTo(String value) {
			addCriterion("major_name =", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotEqualTo(String value) {
			addCriterion("major_name <>", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameGreaterThan(String value) {
			addCriterion("major_name >", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
			addCriterion("major_name >=", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLessThan(String value) {
			addCriterion("major_name <", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLessThanOrEqualTo(String value) {
			addCriterion("major_name <=", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameLike(String value) {
			addCriterion("major_name like", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotLike(String value) {
			addCriterion("major_name not like", value, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameIn(List<String> values) {
			addCriterion("major_name in", values, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotIn(List<String> values) {
			addCriterion("major_name not in", values, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameBetween(String value1, String value2) {
			addCriterion("major_name between", value1, value2, "majorName");
			return (Criteria) this;
		}

		public Criteria andMajorNameNotBetween(String value1, String value2) {
			addCriterion("major_name not between", value1, value2, "majorName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameIsNull() {
			addCriterion("college_name is null");
			return (Criteria) this;
		}

		public Criteria andCollegeNameIsNotNull() {
			addCriterion("college_name is not null");
			return (Criteria) this;
		}

		public Criteria andCollegeNameEqualTo(String value) {
			addCriterion("college_name =", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameNotEqualTo(String value) {
			addCriterion("college_name <>", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameGreaterThan(String value) {
			addCriterion("college_name >", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
			addCriterion("college_name >=", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameLessThan(String value) {
			addCriterion("college_name <", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameLessThanOrEqualTo(String value) {
			addCriterion("college_name <=", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameLike(String value) {
			addCriterion("college_name like", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameNotLike(String value) {
			addCriterion("college_name not like", value, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameIn(List<String> values) {
			addCriterion("college_name in", values, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameNotIn(List<String> values) {
			addCriterion("college_name not in", values, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameBetween(String value1, String value2) {
			addCriterion("college_name between", value1, value2, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCollegeNameNotBetween(String value1, String value2) {
			addCriterion("college_name not between", value1, value2, "collegeName");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_sports_course
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
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
     * This class corresponds to the database table wzsport_sports_course
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 23 15:09:25 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}