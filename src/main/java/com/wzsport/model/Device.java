package com.wzsport.model;

public class Device {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device.id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device.device_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	private String deviceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device.user_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	private Long userId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device.id
	 * @return  the value of wzsport_device.id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device.id
	 * @param id  the value for wzsport_device.id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device.device_id
	 * @return  the value of wzsport_device.device_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device.device_id
	 * @param deviceId  the value for wzsport_device.device_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device.user_id
	 * @return  the value of wzsport_device.user_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device.user_id
	 * @param userId  the value for wzsport_device.user_id
	 * @mbg.generated  Fri Mar 23 18:24:56 CST 2018
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}