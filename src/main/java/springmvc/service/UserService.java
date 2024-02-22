package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.controller.model.user.UserDao;
import springmvc.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user)
	{
		return this.userDao.saveUser(user);
	}
}
