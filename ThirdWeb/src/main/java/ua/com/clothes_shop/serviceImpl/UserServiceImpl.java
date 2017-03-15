package ua.com.clothes_shop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.UserDao;
import ua.com.clothes_shop.entity.Role;
import ua.com.clothes_shop.entity.User;
import ua.com.clothes_shop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		user.setRole(Role.ROLE_USER);
		userDao.save(user);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
}