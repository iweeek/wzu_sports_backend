package com.wzsport.model;

import java.util.Date;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.id
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.name
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.id
	 * @return  the value of wzsport_role.id
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.id
	 * @param id  the value for wzsport_role.id
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.name
	 * @return  the value of wzsport_role.name
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.name
	 * @param name  the value for wzsport_role.name
	 * @mbg.generated  Sun Apr 01 19:24:02 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}
}