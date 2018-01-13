package com.wzsport.model;

import java.util.Date;

public class ClientVersion {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.version_name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private String versionName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.version_code
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Integer versionCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.change_log
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private String changeLog;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.is_forced
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Boolean isForced;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.download_url
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private String downloadUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.is_published
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Boolean isPublished;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.platform_id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Byte platformId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_client_version.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.id
	 * @return  the value of wzsport_client_version.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.id
	 * @param id  the value for wzsport_client_version.id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.version_name
	 * @return  the value of wzsport_client_version.version_name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.version_name
	 * @param versionName  the value for wzsport_client_version.version_name
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.version_code
	 * @return  the value of wzsport_client_version.version_code
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Integer getVersionCode() {
		return versionCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.version_code
	 * @param versionCode  the value for wzsport_client_version.version_code
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.change_log
	 * @return  the value of wzsport_client_version.change_log
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public String getChangeLog() {
		return changeLog;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.change_log
	 * @param changeLog  the value for wzsport_client_version.change_log
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setChangeLog(String changeLog) {
		this.changeLog = changeLog;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.is_forced
	 * @return  the value of wzsport_client_version.is_forced
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Boolean getIsForced() {
		return isForced;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.is_forced
	 * @param isForced  the value for wzsport_client_version.is_forced
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setIsForced(Boolean isForced) {
		this.isForced = isForced;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.download_url
	 * @return  the value of wzsport_client_version.download_url
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.download_url
	 * @param downloadUrl  the value for wzsport_client_version.download_url
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.is_published
	 * @return  the value of wzsport_client_version.is_published
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Boolean getIsPublished() {
		return isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.is_published
	 * @param isPublished  the value for wzsport_client_version.is_published
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.platform_id
	 * @return  the value of wzsport_client_version.platform_id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Byte getPlatformId() {
		return platformId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.platform_id
	 * @param platformId  the value for wzsport_client_version.platform_id
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setPlatformId(Byte platformId) {
		this.platformId = platformId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.created_at
	 * @return  the value of wzsport_client_version.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.created_at
	 * @param createdAt  the value for wzsport_client_version.created_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_client_version.updated_at
	 * @return  the value of wzsport_client_version.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_client_version.updated_at
	 * @param updatedAt  the value for wzsport_client_version.updated_at
	 * @mbg.generated  Sat Jan 13 16:38:28 CST 2018
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}