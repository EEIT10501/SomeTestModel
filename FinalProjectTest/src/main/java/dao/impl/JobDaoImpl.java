package dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.JobDaoInter;
import model.Job;
import model.JobDetail;
import model.Schedule;
import util.HibernateUtils;

public class JobDaoImpl implements JobDaoInter {

	SessionFactory sessionFactory;

	public static void main(String[] args) {
		Session session = new JobDaoImpl().sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Schedule schedule = session.get(Schedule.class, 1);
		tx.commit();
		System.out.println(schedule);
	}

	public JobDaoImpl() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public Serializable saveJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		Serializable jobId = session.save(job);
		return jobId;
	}

	@Override
	public Serializable saveJob(Job job, JobDetail jobDetail, Schedule schedule) {
		Session session = sessionFactory.getCurrentSession();
		Serializable jobid = session.save(job);
		job = session.get(Job.class, jobid);
		jobDetail.setJob(job);
		session.save(jobDetail);
		schedule.setJob(job);
		session.save(schedule);
		return jobid;
	}

	@Override
	public void updateJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		session.update(job);
	}

	@Override
	public Job getJobById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Job job = session.get(Job.class, id);
		return job;
	}

}
