package com.bharath.spring.springmvcorm.user.services;

import org.springframework.stereotype.Service;

import com.bharath.spring.springmvcorm.user.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
