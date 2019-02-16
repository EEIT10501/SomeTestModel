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

	public User(Integer userId, String email, String password, String phoneNum, String facebook, String google,
			Integer role, Integer membershipLevel, Integer jobPostLimit, Integer exposureLimit, Integer jobPostPeriod,
			Integer absence, Double rating) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.facebook = facebook;
		this.google = google;
		this.role = role;
		this.membershipLevel = membershipLevel;
		this.jobPostLimit = jobPostLimit;
		this.exposureLimit = exposureLimit;
		this.jobPostPeriod = jobPostPeriod;
		this.absence = absence;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", phoneNum=" + phoneNum
				+ ", facebook=" + facebook + ", google=" + google + ", role=" + role + ", membershipLevel="
				+ membershipLevel + ", jobPostLimit=" + jobPostLimit + ", exposureLimit=" + exposureLimit
				+ ", jobPostPeriod=" + jobPostPeriod + ", absence=" + absence + ", rating=" + rating + "]";
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
