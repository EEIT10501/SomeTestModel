package service.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.JobDaoInter;
import dao.impl.JobDaoImpl;
import model.Job;
import model.JobDetail;
import model.Schedule;
import service.JobServiceInter;
import util.HibernateUtils;

public class JobServiceImpl implements JobServiceInter {

	JobDaoInter jobDao;
	SessionFactory sessionFactory;

	public JobServiceImpl() {
		jobDao = new JobDaoImpl();
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public Serializable saveJob(Job job) {
		Serializable jobId = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			jobId = jobDao.saveJob(job);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return jobId;
	}

	@Override
	public Serializable saveJob(Job job, JobDetail jobDetail, Schedule schedule) {
		Serializable jobId = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			jobId = jobDao.saveJob(job, jobDetail, schedule);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return jobId;
	}

	@Override
	public void updateJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			jobDao.updateJob(job);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	@Override
	public Job getJobById(Integer id) {
		Job job = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			job = jobDao.getJobById(id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return job;
	}

}
