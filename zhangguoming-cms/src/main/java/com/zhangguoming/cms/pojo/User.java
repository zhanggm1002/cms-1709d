package com.zhangguoming.cms.pojo;

import java.io.Serializable;
import java.sql.Date;
/**
 * @Description:User类   
 * @author: zhanggm1002
 * @date:   2019年12月10日 下午3:26:24
 */
public class User implements Serializable{
	/*
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private Date birthday;
	private Integer gender;
	private Integer locked;
	private Integer score;
	private String role;
	private String url;
	private Date create_time;
	private Date update_time;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", score=" + score
				+ ", role=" + role + ", url=" + url + ", create_time=" + create_time + ", update_time=" + update_time
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	

}
