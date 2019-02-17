package service.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.UserDaoInter;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserServiceInter;
import util.HibernateUtils;

public class UserServiceImpl implements UserServiceInter {

	UserDaoInter userDao;
	SessionFactory sessionFactory;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public Serializable saveUser(User user) {
		Serializable userId = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userId = userDao.saveUser(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return userId;
	}

	@Override
	public void updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userDao.updateUser(user);
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
	public User getUserById(Integer id) {
		User user = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			user = userDao.getUserById(id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return user;
	}

}
