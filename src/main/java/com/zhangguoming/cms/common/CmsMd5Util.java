package com.zhangguoming.cms.common;

import com.zhanggm.common.utils.Md5Util;

public class CmsMd5Util {
	/**
	 * @Title: stringToMd5   
	 * @Description: TODO(描述这个方法的作用)   
	 * @param: @param str
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String string2MD5(String str) {
		return Md5Util.string2MD5(str+"_cmsAdmin");
	}
	
	public static void main(String[] args) {
		System.out.println(Md5Util.string2MD5("123456"));
	}
}
