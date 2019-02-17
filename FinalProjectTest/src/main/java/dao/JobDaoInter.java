package dao;

import java.io.Serializable;

import model.Job;
import model.JobDetail;
import model.Schedule;

public interface JobDaoInter {
	public Serializable saveJob(Job job);

	public Serializable saveJob(Job job, JobDetail jobDetail, Schedule schedule);

	public void updateJob(Job job);

	public Job getJobById(Integer id);

}
