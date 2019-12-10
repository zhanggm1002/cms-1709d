package com.zhangguoming.cms.service;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public interface UserService {
	/**
	 * @Title: register   
	 * @Description: 注册新增用户   
	 * @param: @param user
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean register(User user);
	/**
	 * @Title: getByUsername   
	 * @Description: 根据登录名称，查询用户   
	 * @param: @param username
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	public User getByUsername(String username);
	
	
}
