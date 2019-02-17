package model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Schedule {

	private Integer scheduleId;
	private Date workDate;
	private Time startTime;
	private Time endTime;
	private Job job;

	public Schedule() {
	}

	public Schedule(Integer scheduleId, Date workDate, Time startTime, Time endTime, Job job) {
		super();
		this.scheduleId = scheduleId;
		this.workDate = workDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", workDate=" + workDate + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_Job_Id")
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}
