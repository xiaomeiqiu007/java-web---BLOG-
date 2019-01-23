package com.qingyun.dao;

import com.qingyun.entity.*;
public interface BlogUserInterface {
	/*
	 * 注册
	 * */
	public boolean register(User user);
	/*
	 * 登录
	 * */
	public boolean login(User user);	
}
