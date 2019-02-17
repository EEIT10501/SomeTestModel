package model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Job {

	private Integer jobId;
	private String title;
	private Date postEndDate;
	private Boolean isFilled;
	private Integer viewTimes;
	private Integer applicant;
	private String comment;
	private Integer reviewStatus;
	private String failReason;
	private Boolean isExposure;
	private User user;
	private JobDetail jobDetail;
	private Schedule schedule;

	public Job() {
	}

	public Job(Integer jobId, String title, Date postEndDate, Boolean isFilled, Integer viewTimes, Integer applicant,
			String comment, Integer reviewStatus, String failReason, Boolean isExposure, User user, JobDetail jobDetail,
			Schedule schedule) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.postEndDate = postEndDate;
		this.isFilled = isFilled;
		this.viewTimes = viewTimes;
		this.applicant = applicant;
		this.comment = comment;
		this.reviewStatus = reviewStatus;
		this.failReason = failReason;
		this.isExposure = isExposure;
		this.user = user;
		this.jobDetail = jobDetail;
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", postEndDate=" + postEndDate + ", isFilled=" + isFilled
				+ ", viewTimes=" + viewTimes + ", applicant=" + applicant + ", comment=" + comment + ", reviewStatus="
				+ reviewStatus + ", failReason=" + failReason + ", isExposure=" + isExposure + ", user=" + user
				+ ", jobDetail=" + jobDetail + ", schedule=" + schedule + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPostEndDate() {
		return postEndDate;
	}

	public void setPostEndDate(Date postEndDate) {
		this.postEndDate = postEndDate;
	}

	public Boolean getIsFilled() {
		return isFilled;
	}

	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Integer getViewTimes() {
		return viewTimes;
	}

	public void setViewTimes(Integer viewTimes) {
		this.viewTimes = viewTimes;
	}

	public Integer getApplicant() {
		return applicant;
	}

	public void setApplicant(Integer applicant) {
		this.applicant = applicant;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Boolean getIsExposure() {
		return isExposure;
	}

	public void setIsExposure(Boolean isExposure) {
		this.isExposure = isExposure;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_User_Id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToOne(mappedBy = "job")
	public JobDetail getJobDetail() {
		return jobDetail;
	}

	public void setJobDetail(JobDetail jobDetail) {
		this.jobDetail = jobDetail;
	}

	@OneToOne(mappedBy = "job")
	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
