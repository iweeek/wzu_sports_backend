package com.wzsport.model;

import java.util.Date;

public class University {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_university.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_university.name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_university.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_university.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_university.id
	 * @return  the value of wzsport_university.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_university.id
	 * @param id  the value for wzsport_university.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_university.name
	 * @return  the value of wzsport_university.name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_university.name
	 * @param name  the value for wzsport_university.name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_university.created_at
	 * @return  the value of wzsport_university.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_university.created_at
	 * @param createdAt  the value for wzsport_university.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_university.updated_at
	 * @return  the value of wzsport_university.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_university.updated_at
	 * @param updatedAt  the value for wzsport_university.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}