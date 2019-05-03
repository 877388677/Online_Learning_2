package com.ysc.apps.online.dao.extend;

import java.util.List;

import com.ysc.apps.online.bean.extend.CourseChapterVM;

public interface CourseChapterVMMapper {

	
	CourseChapterVM selectById(Long id);

	List<CourseChapterVM> selectAll();
	
	List<CourseChapterVM> query(String keywords);

}
