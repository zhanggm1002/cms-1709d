package com.zhangguoming.cms.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangguoming.cms.dao.UserDao;
import com.zhangguoming.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class UserTests {
	@Autowired
	private UserDao userDao;
	@Test
	public void select() {
		List<User> userList = userDao.select();
		System.out.println(userList);
	}
}
