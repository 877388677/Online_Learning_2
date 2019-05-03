package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.HomeworkQuestion;
import com.ysc.apps.online.bean.extend.HomeworkQuestionVM;
import com.ysc.apps.online.dao.HomeworkQuestionMapper;
import com.ysc.apps.online.dao.extend.HomeworkQuestionVMMapper;
import com.ysc.apps.online.service.IHomeworkQuestionService;

@Service
public class HomeworkQuestionServiceImpl implements IHomeworkQuestionService{

	@Autowired
	private HomeworkQuestionVMMapper questionVMMapper;
	@Autowired
	private HomeworkQuestionMapper questionMapper;
	
	
	@Override
	public HomeworkQuestionVM selectById(long id) throws Exception {
		return questionVMMapper.selectById(id);
	}

	@Override
	public List<HomeworkQuestionVM> query(String keywords) throws Exception {

		return questionVMMapper.query(keywords);
	}

	@Override
	public void saveOrUpdate(HomeworkQuestion question) throws Exception {
		
		if(question.getId()!=null){
			questionMapper.updateByPrimaryKey(question);
		}else{
			questionMapper.insert(question);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		questionMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(Long[] ids) throws Exception {
		for(long id : ids)
			questionMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<HomeworkQuestionVM> selectAll() throws Exception {
		return questionVMMapper.selectAll();
	}

}
