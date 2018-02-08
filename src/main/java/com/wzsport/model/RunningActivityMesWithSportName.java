/**
 * 
 */
package com.wzsport.model;

/**
 * @author wenky
 *
 */
public class RunningActivityMesWithSportName {
	private String name;
	private String studentNo;
	private int isMan;
	private String sportName;
	private double distance;
	private double costTime;
	private double speed;
	private double stepCount;
	private double stepPerSecond;
	private double distancePerStep;
	private long id;
	
	@Override
	public String toString() {
		return "RunningActivityMesWithSportName [name=" + name + ", studentNo=" + studentNo + ", isMan=" + isMan
				+ ", sportName=" + sportName + ", distance=" + distance + ", costTime=" + costTime + ", speed=" + speed
				+ ", stepCount=" + stepCount + ", stepPerSecond=" + stepPerSecond + ", distancePerStep="
				+ distancePerStep + ", id=" + id + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public int getIsMan() {
		return isMan;
	}
	public void setIsMan(int isMan) {
		this.isMan = isMan;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getCostTime() {
		return costTime;
	}
	public void setCostTime(double costTime) {
		this.costTime = costTime;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getStepCount() {
		return stepCount;
	}
	public void setStepCount(double stepCount) {
		this.stepCount = stepCount;
	}
	public double getStepPerSecond() {
		return stepPerSecond;
	}
	public void setStepPerSecond(double stepPerSecond) {
		this.stepPerSecond = stepPerSecond;
	}
	public double getDistancePerStep() {
		return distancePerStep;
	}
	public void setDistancePerStep(double distancePerStep) {
		this.distancePerStep = distancePerStep;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
