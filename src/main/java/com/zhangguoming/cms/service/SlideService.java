package com.zhangguoming.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangguoming.cms.dao.SlideDao;
import com.zhangguoming.cms.pojo.Slide;

@Service
public class SlideService {
	@Autowired
	private SlideDao slideDao;
	/**
	 * @Title: getAll   
	 * @Description: 查询所有轮播图   
	 * @param: @return      
	 * @return: List<Slide>      
	 * @throws
	 */
	public List<Slide> getAll(){
		List<Slide> slideList = slideDao.select(null);
		return slideList;
	}
}
