package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.extend.CourseVideoVM;
import com.ysc.apps.online.dao.CourseVideoMapper;
import com.ysc.apps.online.dao.extend.CourseVideoVMMapper;
import com.ysc.apps.online.service.ICourseVideoService;


@Service
public class CourseVideoServiceImpl implements ICourseVideoService{

	@Autowired
	private CourseVideoMapper videoMapper;
	
	
	//外键级联查询
	@Autowired
	private CourseVideoVMMapper videoVMMapper;
	
	@Override
	public CourseVideoVM selectById(long id) throws Exception {
		
		return  videoVMMapper.selectById(id);
	}


	@Override
	public void saveOrUpdate(CourseVideo video) throws Exception {
		if(video.getId()!=null){
			videoMapper.updateByPrimaryKey(video);
		}else{
			videoMapper.insert(video);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		videoMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(Long[] ids) throws Exception {

		for(long id : ids){
			videoMapper.deleteByPrimaryKey(id);
	}
		
	}

	@Override
	public List<CourseVideoVM> selectAll() throws Exception {
		
		return videoVMMapper.selectAll();
	}

}
