package com.ysc.apps.online.service;

import java.util.List;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.extend.CourseVideoVM;

public interface ICourseVideoService {
	
	//根据id查找所有(courseChapter_id)
    CourseVideoVM selectById(long id) throws Exception;
	
	
	//保存及修改
	void saveOrUpdate(CourseVideo video) throws Exception;
	
	//根据id删除
	void deleteById(long id) throws Exception;
	
	//批量删除
	void batchDelete(Long[] ids) throws Exception;
	
	//外键链接查询所有(courseChapter_id)
	List<CourseVideoVM> selectAll() throws Exception;
}
