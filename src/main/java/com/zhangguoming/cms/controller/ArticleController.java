package com.zhangguoming.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhanggm.common.utils.Md5Util;
import com.zhangguoming.cms.dao.ArticleDao;
import com.zhangguoming.cms.pojo.Article;

@Controller
@RequestMapping("/article/")
public class ArticleController {
	@Autowired
	private ArticleDao articleDao;
	/**
	 * @Title: add   
	 * @Description: 发布文章   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("add")
	public String add(Model model) {
		Article article = articleDao.selectById(1);
		Md5Util.string2MD5("abc");
		model.addAttribute("article", null);
		
		return "article/add";
	}
	/**
	 * @Title: update   
	 * @Description: 修改文章   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("update")
	public String update() {
		return "update";
	}
}
