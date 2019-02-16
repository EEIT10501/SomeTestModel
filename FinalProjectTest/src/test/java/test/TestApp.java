package test;

import model.User;
import service.UserServiceInter;
import service.impl.UserServiceImpl;

public class TestApp {

	public static void main(String[] args) {

		UserServiceInter userService = new UserServiceImpl();

//		User user = new User(null, "sam810331@gmail.com", "12345678", "0918500406", null, null, 2, 1, 3, 0,
//				1000 * 60 * 60 * 24 * 7, 0, null);
//
//		userService.saveUser(user);

		User user = userService.getUserById(1);
		user.setRating(3.5);
		System.out.println(user);
		userService.updateUser(user);

	}

}
