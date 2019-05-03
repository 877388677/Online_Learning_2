package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.User;

public interface IUserService {
	
	//查询所有User
	List<User> findAll() throws Exception; 

	//根据id查询
	User findById(long id) throws Exception; 
	
	//更新
	void update(User user) throws Exception;
	
	//注册
	void register(User user) throws Exception; 

	//登录
	boolean isExist(User user);  
	
	//根据id删除
	void deleteById(long id) throws Exception;
	
	//批量删除
	void batchDelete(List<Long> ids) throws Exception; 
}

