package com.zhangguoming.cms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangguoming.cms.dao.ArticleDao;
import com.zhangguoming.cms.dao.CategoryDao;
import com.zhangguoming.cms.dao.ChannelDao;
import com.zhangguoming.cms.pojo.Article;
import com.zhangguoming.cms.pojo.Category;
import com.zhangguoming.cms.pojo.Channel;
import com.zhangguoming.cms.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private ChannelDao channelDao;
	@Autowired
	private CategoryDao categoryDao;
	
	
	@Override
	public PageInfo<Article> getPageInfo(Article article, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Article> articleList = articleDao.select(article);
		return new PageInfo<>(articleList);
	}

	@Override
	public boolean updateStatus(Integer id, int status) {
		return articleDao.updateStatus(id, status)>0;
	}

	@Override
	public boolean addHot(Integer id) {
		return articleDao.addHot(id)>0;
	}

	@Override
	public List<Channel> getChannelList() {
		return channelDao.select(null);
	}

	@Override
	public Article getById(Integer id) {
		return articleDao.selectById(id);
	}

	@Override
	public boolean save(Article article) {
		if(article.getId()==null) {
			article.setDeleted(0);
			article.setCreated(new Date());
			article.setUpdated(new Date());
			article.setCommentcnt(0);
			article.setHits(0);
			article.setHot(0);
			articleDao.insert(article);
		}else {
			article.setUpdated(new Date());
			articleDao.update(article);
		}
		return false;
	}

	@Override
	public List<Category> getCateListByChannelId(Integer channelId) {
		return categoryDao.selectListByChannelId(channelId);
	}

}
