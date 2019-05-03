package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.Course;
import com.ysc.apps.online.bean.extend.CourseVM;
import com.ysc.apps.online.dao.CourseMapper;
import com.ysc.apps.online.dao.extend.CourseVMMapper;
import com.ysc.apps.online.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService{

	@Autowired
	private CourseVMMapper courseVMMapper;
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public List<CourseVM> findAllVM() throws Exception {
		return courseVMMapper.selectAll();
	}

	@Override
	public CourseVM findById(long id) throws Exception {
		return courseVMMapper.selectById(id);
	}

	@Override
	public List<CourseVM> findByKeyword(String keywords) throws Exception {
		return courseVMMapper.query(keywords);
	}

	@Override
	public void saveOrUpdate(Course course) throws Exception {
		if(course.getId()!=null){
			courseMapper.updateByPrimaryKey(course);
		}
		else{
			courseMapper.insert(course);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		courseMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		for(long id:ids){
			courseMapper.deleteByPrimaryKey(id);
		}
	}
	

}
