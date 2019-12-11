package com.zhangguoming.cms.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangguoming.cms.dao.ArticleDao;
import com.zhangguoming.cms.dao.ArticleVoteDao;
import com.zhangguoming.cms.dao.CategoryDao;
import com.zhangguoming.cms.dao.ChannelDao;
import com.zhangguoming.cms.dao.CommentDao;
import com.zhangguoming.cms.dao.SettingsDao;
import com.zhangguoming.cms.dao.SlideDao;
import com.zhangguoming.cms.dao.TagDao;
import com.zhangguoming.cms.dao.UserDao;
import com.zhangguoming.cms.dao.VoteContentDao;
import com.zhangguoming.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring-beans.xml")
public class UserTests {
	@Autowired
	private UserDao userDao;
	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private ArticleVoteDao articleVoteDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private ChannelDao channelDao;
	@Autowired
	private CommentDao commentDao;
	@Autowired
	private SettingsDao settingsDao;
	@Autowired
	private SlideDao slideDao;
	@Autowired
	private TagDao tagDao;
	@Autowired
	private VoteContentDao voteContentDao;
	
	@Test
	public void select() {
		List<User> userList = userDao.select(null);
		System.out.println(userList);
		
		User user = new User();
		user.setUsername("lisi");
		user.setPassword("123456");
		userDao.deleteByIds("170");
		
	}
}
