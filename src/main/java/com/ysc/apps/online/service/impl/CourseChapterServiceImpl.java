package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.CourseChapter;
import com.ysc.apps.online.bean.extend.CourseChapterVM;
import com.ysc.apps.online.dao.CourseChapterMapper;
import com.ysc.apps.online.dao.extend.CourseChapterVMMapper;
import com.ysc.apps.online.service.ICourseChapterService;


@Service
public class CourseChapterServiceImpl implements ICourseChapterService{

	@Autowired
	private CourseChapterVMMapper chapterVMMapper;
	
	@Autowired
	private CourseChapterMapper chapterMapper;
	
	@Override
	public List<CourseChapterVM> findAllChapterVM() throws Exception {
		return chapterVMMapper.selectAll();
	}

	@Override
	public CourseChapterVM findById(long id) throws Exception {
		return chapterVMMapper.selectById(id);
	}

	@Override
	public List<CourseChapterVM> findByKeyword(String keywords) throws Exception {
		
		return chapterVMMapper.query(keywords);
	}

	@Override
	public void saveOrUpdate(CourseChapter chapter) throws Exception {
		if(chapter.getId()!=null){
			chapterMapper.updateByPrimaryKey(chapter);
		}
		else{
			chapterMapper.insert(chapter);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		chapterMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		for(long id:ids){
			chapterMapper.deleteByPrimaryKey(id);
		}
		
		
	}

}
