package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.HomeworkQuestion;
import com.ysc.apps.online.bean.extend.HomeworkQuestionVM;

public interface IHomeworkQuestionService {
	
	 //根据id查找所有(school_id)
	HomeworkQuestionVM selectById(long id) throws Exception;
	
    //根据关键字查找(school_id)
	List<HomeworkQuestionVM> query(String keywords) throws Exception;
	
	//保存及修改
	void saveOrUpdate(HomeworkQuestion question) throws Exception;
	
	//根据id删除
	void deleteById(long id) throws Exception;
	
	//批量删除
	void batchDelete(Long[] ids) throws Exception;
	
	//外键链接查询所有(school_id)
	List<HomeworkQuestionVM> selectAll() throws Exception;

}
