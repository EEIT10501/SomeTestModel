package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"User\"")
public class User {

	private Integer userId;
	private String email;
	private String password;
	private String phoneNum;
	private String facebook;
	private String google;
	private Integer role;
	private Integer membershipLevel;
	private Integer jobPostLimit;
	private Integer exposureLimit;
	private Integer jobPostPeriod;
	private Integer absence;
	private Double rating;

	public User() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getMembershipLevel() {
		return membershipLevel;
	}

	public void setMembershipLevel(Integer membershipLevel) {
		this.membershipLevel = membershipLevel;
	}

	public Integer getJobPostLimit() {
		return jobPostLimit;
	}

	public void setJobPostLimit(Integer jobPostLimit) {
		this.jobPostLimit = jobPostLimit;
	}

	public Integer getExposureLimit() {
		return exposureLimit;
	}

	public void setExposureLimit(Integer exposureLimit) {
		this.exposureLimit = exposureLimit;
	}

	public Integer getJobPostPeriod() {
		return jobPostPeriod;
	}

	public void setJobPostPeriod(Integer jobPostPeriod) {
		this.jobPostPeriod = jobPostPeriod;
	}

	public Integer getAbsence() {
		return absence;
	}

	public void setAbsence(Integer absence) {
		this.absence = absence;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

}
