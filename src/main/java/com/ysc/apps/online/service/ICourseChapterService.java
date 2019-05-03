package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.CourseChapter;
import com.ysc.apps.online.bean.extend.CourseChapterVM;

public interface ICourseChapterService {
	
	 //查询所有课程章节(包括课程视频)
	List<CourseChapterVM> findAllChapterVM() throws Exception;
	
	//通过id查询课程章节
	CourseChapterVM findById (long id) throws Exception;

	//通过关键字查询课程章节
	List<CourseChapterVM> findByKeyword (String keywords) throws Exception;
	
	//保存或更新（修改）课程章节信息
	void saveOrUpdate (CourseChapter chapter) throws Exception;

	//通过id删除课程章节信息
	void deleteById (long id) throws Exception;
	
	// 批量删除课程章节信息
	void batchDelete (List<Long> ids) throws Exception;

}
