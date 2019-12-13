package com.zhangguoming.cms.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhangguoming.cms.pojo.User;
import com.zhangguoming.cms.service.UserService;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	@Autowired
	private UserService userService;
	
	/**
	 * @Title: login   
	 * @Description: 后台登录   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/")
	public String login() {
		return "admin/login";
	}
	/**
	 * @Title: home   
	 * @Description: 后台首页  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/home")
	public String home() {
		return "admin/home";
	}
	/**
	 * @Title: welcome   
	 * @Description: 后台欢迎页面   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/welcome")
	public String welcome() {
		return "admin/welcome";
	}
	/**
	 * @Title: user   
	 * @Description: 用户管理   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/user")
	public String user(User user,Model model,
			@RequestParam(value="pageNum",defaultValue="1") int pageNum,@RequestParam(value="pageSize",defaultValue="3") int pageSize) {
		PageInfo<User> pageInfo = userService.getPageInfo(user,pageNum,pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "admin/user";
	}
	/**
	 * @Title: locked   
	 * @Description: 禁用用户   
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	@RequestMapping("/user/locked")
	@ResponseBody
	public boolean locked(Integer userId) {
		boolean locked = userService.locked(userId);
		return locked;
	}
	/**
	 * @Title: unLocked   
	 * @Description: 启用  
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	@RequestMapping("/user/unLocked")
	@ResponseBody
	public boolean unLocked(Integer userId) {
		boolean locked = userService.unLocked(userId);
		return locked;
	}
	
	/**
	 * @Title: article   
	 * @Description: 文章管理  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/article")
	public String article() {
		return "admin/article";
	}
	

}
