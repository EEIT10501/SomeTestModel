package service;

import java.io.Serializable;

import model.User;

public interface UserServiceInter {
	public Serializable saveUser(User user);

	public void updateUser(User user);

	public User getUserById(Integer id);
}
