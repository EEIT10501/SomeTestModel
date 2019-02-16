package dao;

import java.io.Serializable;

import model.User;

public interface UserDaoInter {
	public Serializable saveUser(User user);

	public void updateUser(User user);

	public User getUserById(Integer id);

}
