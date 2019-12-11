package com.zhangguoming.cms.service.impl;

import org.springframework.stereotype.Service;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import com.zhangguoming.cms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean locked(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unLocked(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addScore(Integer userId, int score) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
