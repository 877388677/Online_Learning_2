package com.ysc.apps.online.dao.extend;

import java.util.List;

import com.ysc.apps.online.bean.extend.HomeworkQuestionVM;


public interface HomeworkQuestionVMMapper {
	
	
	//查找所有
	List<HomeworkQuestionVM> selectAll();
	
	//按id查找
	HomeworkQuestionVM selectById(Long id);
	
	//按关键字查找
	List<HomeworkQuestionVM> query(String keywords);
	
	//按章节ChapterId查询所有
	List<HomeworkQuestionVM> selectAllByChapterid(Long id);
	
	
	List<HomeworkQuestionVM> selectAllByCourseid(Long id);
}
