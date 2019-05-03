package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.Course;
import com.ysc.apps.online.bean.extend.CourseVM;

public interface ICourseService {
	
		//查询所有课程(包括课程章节)
		List<CourseVM> findAllVM() throws Exception;
		
		//通过id查询课程
		CourseVM findById (long id) throws Exception;

		//通过关键字查询课程
		List<CourseVM> findByKeyword (String keywords) throws Exception;
		
		//保存或更新（修改）课程信息
		void saveOrUpdate (Course course) throws Exception;

		//通过id删除课程信息
		void deleteById (long id) throws Exception;
		
		// 批量删除课程信息
		void batchDelete (List<Long> ids) throws Exception;
	

}
