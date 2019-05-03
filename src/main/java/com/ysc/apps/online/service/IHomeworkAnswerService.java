package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.HomeworkAnswer;
import com.ysc.apps.online.bean.extend.HomeworkAnswerVM;

public interface IHomeworkAnswerService {
	
	  List<HomeworkAnswer> findAll() throws Exception;
		
	  HomeworkAnswer findById(long id) throws Exception;
		
	  void saveOrUpdate(HomeworkAnswer answer) throws Exception;
		
	  void deleteById(long id) throws Exception;
		
	  void batchDelete(List<Long> ids) throws Exception;
		
	  List<HomeworkAnswerVM> selectAll()throws Exception;
	

}
