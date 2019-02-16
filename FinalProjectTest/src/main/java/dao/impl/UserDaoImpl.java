package dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.UserDaoInter;
import model.User;
import util.HibernateUtils;

public class UserDaoImpl implements UserDaoInter {

	SessionFactory sessionFactory;

	public UserDaoImpl() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public Serializable saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Serializable userId = session.save(user);
		return userId;
	}

	@Override
	public void updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	@Override
	public User getUserById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, id);
		return user;
	}

}
