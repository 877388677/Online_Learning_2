package com.ysc.apps.online.dao.extend;

import java.util.List;

import com.ysc.apps.online.bean.extend.CourseVideoVM;


//级联表查询
public interface CourseVideoVMMapper {
		
		//查找所有
		List<CourseVideoVM> selectAll();
		
		//按id查找
		CourseVideoVM selectById(Long id);
		 

	


}
