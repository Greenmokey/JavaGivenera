package com.givenera.share.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.givenera.dao.share.IUserDao;
import com.givenera.share.entity.User;
import com.givenera.share.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
