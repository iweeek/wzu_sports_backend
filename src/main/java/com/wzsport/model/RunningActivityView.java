package com.wzsport.model;

import java.util.Date;

public class RunningActivityView {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.end_running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long endRunningSportId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long runningSportId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.student_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long studentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer distance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.step_count
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer stepCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer costTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.speed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Double speed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.step_per_second
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Double stepPerSecond;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.distance_per_step
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Double distancePerStep;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.target_finished_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer targetFinishedTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.start_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.kcal_consumed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer kcalConsumed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.qualified
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Boolean qualified;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.is_valid
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Boolean isValid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.qualified_distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer qualifiedDistance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.qualified_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer qualifiedCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.min_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Integer minCostTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.user_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.class_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long classId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.university_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.student_no
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private String studentNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.is_man
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Boolean isMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.name
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.ended_at
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Date endedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_view.ended_by
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	private Boolean endedBy;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.end_running_sport_id
	 * @return  the value of wzsport_running_activity_view.end_running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getEndRunningSportId() {
		return endRunningSportId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.end_running_sport_id
	 * @param endRunningSportId  the value for wzsport_running_activity_view.end_running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setEndRunningSportId(Long endRunningSportId) {
		this.endRunningSportId = endRunningSportId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.running_sport_id
	 * @return  the value of wzsport_running_activity_view.running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getRunningSportId() {
		return runningSportId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.running_sport_id
	 * @param runningSportId  the value for wzsport_running_activity_view.running_sport_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setRunningSportId(Long runningSportId) {
		this.runningSportId = runningSportId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.student_id
	 * @return  the value of wzsport_running_activity_view.student_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.student_id
	 * @param studentId  the value for wzsport_running_activity_view.student_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.distance
	 * @return  the value of wzsport_running_activity_view.distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getDistance() {
		return distance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.distance
	 * @param distance  the value for wzsport_running_activity_view.distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.step_count
	 * @return  the value of wzsport_running_activity_view.step_count
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getStepCount() {
		return stepCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.step_count
	 * @param stepCount  the value for wzsport_running_activity_view.step_count
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setStepCount(Integer stepCount) {
		this.stepCount = stepCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.cost_time
	 * @return  the value of wzsport_running_activity_view.cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getCostTime() {
		return costTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.cost_time
	 * @param costTime  the value for wzsport_running_activity_view.cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setCostTime(Integer costTime) {
		this.costTime = costTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.speed
	 * @return  the value of wzsport_running_activity_view.speed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.speed
	 * @param speed  the value for wzsport_running_activity_view.speed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.step_per_second
	 * @return  the value of wzsport_running_activity_view.step_per_second
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Double getStepPerSecond() {
		return stepPerSecond;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.step_per_second
	 * @param stepPerSecond  the value for wzsport_running_activity_view.step_per_second
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setStepPerSecond(Double stepPerSecond) {
		this.stepPerSecond = stepPerSecond;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.distance_per_step
	 * @return  the value of wzsport_running_activity_view.distance_per_step
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Double getDistancePerStep() {
		return distancePerStep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.distance_per_step
	 * @param distancePerStep  the value for wzsport_running_activity_view.distance_per_step
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setDistancePerStep(Double distancePerStep) {
		this.distancePerStep = distancePerStep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.target_finished_time
	 * @return  the value of wzsport_running_activity_view.target_finished_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getTargetFinishedTime() {
		return targetFinishedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.target_finished_time
	 * @param targetFinishedTime  the value for wzsport_running_activity_view.target_finished_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setTargetFinishedTime(Integer targetFinishedTime) {
		this.targetFinishedTime = targetFinishedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.start_time
	 * @return  the value of wzsport_running_activity_view.start_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.start_time
	 * @param startTime  the value for wzsport_running_activity_view.start_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.kcal_consumed
	 * @return  the value of wzsport_running_activity_view.kcal_consumed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getKcalConsumed() {
		return kcalConsumed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.kcal_consumed
	 * @param kcalConsumed  the value for wzsport_running_activity_view.kcal_consumed
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setKcalConsumed(Integer kcalConsumed) {
		this.kcalConsumed = kcalConsumed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.qualified
	 * @return  the value of wzsport_running_activity_view.qualified
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Boolean getQualified() {
		return qualified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.qualified
	 * @param qualified  the value for wzsport_running_activity_view.qualified
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setQualified(Boolean qualified) {
		this.qualified = qualified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.is_valid
	 * @return  the value of wzsport_running_activity_view.is_valid
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Boolean getIsValid() {
		return isValid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.is_valid
	 * @param isValid  the value for wzsport_running_activity_view.is_valid
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.qualified_distance
	 * @return  the value of wzsport_running_activity_view.qualified_distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getQualifiedDistance() {
		return qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.qualified_distance
	 * @param qualifiedDistance  the value for wzsport_running_activity_view.qualified_distance
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setQualifiedDistance(Integer qualifiedDistance) {
		this.qualifiedDistance = qualifiedDistance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.qualified_cost_time
	 * @return  the value of wzsport_running_activity_view.qualified_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getQualifiedCostTime() {
		return qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.qualified_cost_time
	 * @param qualifiedCostTime  the value for wzsport_running_activity_view.qualified_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setQualifiedCostTime(Integer qualifiedCostTime) {
		this.qualifiedCostTime = qualifiedCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.min_cost_time
	 * @return  the value of wzsport_running_activity_view.min_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Integer getMinCostTime() {
		return minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.min_cost_time
	 * @param minCostTime  the value for wzsport_running_activity_view.min_cost_time
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setMinCostTime(Integer minCostTime) {
		this.minCostTime = minCostTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.user_id
	 * @return  the value of wzsport_running_activity_view.user_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.user_id
	 * @param userId  the value for wzsport_running_activity_view.user_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.class_id
	 * @return  the value of wzsport_running_activity_view.class_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getClassId() {
		return classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.class_id
	 * @param classId  the value for wzsport_running_activity_view.class_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setClassId(Long classId) {
		this.classId = classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.university_id
	 * @return  the value of wzsport_running_activity_view.university_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.university_id
	 * @param universityId  the value for wzsport_running_activity_view.university_id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.student_no
	 * @return  the value of wzsport_running_activity_view.student_no
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public String getStudentNo() {
		return studentNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.student_no
	 * @param studentNo  the value for wzsport_running_activity_view.student_no
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.is_man
	 * @return  the value of wzsport_running_activity_view.is_man
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Boolean getIsMan() {
		return isMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.is_man
	 * @param isMan  the value for wzsport_running_activity_view.is_man
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setIsMan(Boolean isMan) {
		this.isMan = isMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.name
	 * @return  the value of wzsport_running_activity_view.name
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.name
	 * @param name  the value for wzsport_running_activity_view.name
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.id
	 * @return  the value of wzsport_running_activity_view.id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.id
	 * @param id  the value for wzsport_running_activity_view.id
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.ended_at
	 * @return  the value of wzsport_running_activity_view.ended_at
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Date getEndedAt() {
		return endedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.ended_at
	 * @param endedAt  the value for wzsport_running_activity_view.ended_at
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setEndedAt(Date endedAt) {
		this.endedAt = endedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_view.ended_by
	 * @return  the value of wzsport_running_activity_view.ended_by
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public Boolean getEndedBy() {
		return endedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_view.ended_by
	 * @param endedBy  the value for wzsport_running_activity_view.ended_by
	 * @mbg.generated  Sun Nov 12 14:19:28 CST 2017
	 */
	public void setEndedBy(Boolean endedBy) {
		this.endedBy = endedBy;
	}
}