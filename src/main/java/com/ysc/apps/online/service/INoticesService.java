package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.Notices;


public interface INoticesService {
	
	
	//查询所有User
		List<Notices> findAll() throws Exception; 

		//根据id查询
		Notices findById(long id) throws Exception; 
		
		//根据关键字查询
		List<Notices> query(String keywords) throws Exception;
		
		//更新Or保存
		void saveOrUpdate(Notices notices) throws Exception;
		
		//根据id删除
		void deleteById(long id) throws Exception;
		
		//批量删除
		void batchDelete(List<Long> ids) throws Exception; 

}
