package com.ysc.apps.online.dao.extend;

import java.util.List;

import com.ysc.apps.online.bean.extend.CourseVM;

public interface CourseVMMapper {

	
	CourseVM selectById(Long id);

	List<CourseVM> selectAll();
	
	List<CourseVM> query(String keywords);

}
