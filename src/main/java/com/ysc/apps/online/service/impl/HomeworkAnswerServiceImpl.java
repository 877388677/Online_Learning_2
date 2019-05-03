package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.HomeworkAnswer;
import com.ysc.apps.online.bean.HomeworkAnswerExample;
import com.ysc.apps.online.bean.extend.HomeworkAnswerVM;
import com.ysc.apps.online.dao.HomeworkAnswerMapper;
import com.ysc.apps.online.dao.extend.HomeworkAnswerVMMapper;
import com.ysc.apps.online.service.IHomeworkAnswerService;

@Service
public class HomeworkAnswerServiceImpl implements IHomeworkAnswerService{

	@Autowired
	private HomeworkAnswerMapper answerMapper;
	
	@Autowired
	private HomeworkAnswerVMMapper answerVMMapper;
	
	
	@Override
	public List<HomeworkAnswer> findAll() throws Exception {
		HomeworkAnswerExample example = new HomeworkAnswerExample();
		return answerMapper.selectByExample(example);
	}

	@Override
	public HomeworkAnswer findById(long id) throws Exception {
		return answerMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(HomeworkAnswer answer) throws Exception {

		if(answer.getId()!=null){
			//更新
			answerMapper.updateByPrimaryKey(answer);
		}else{
			//插入
			answerMapper.insert(answer);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		answerMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		for(long id:ids)
			answerMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<HomeworkAnswerVM> selectAll() throws Exception {
		return answerVMMapper.selectAll();
	}

}
