package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.Notices;
import com.ysc.apps.online.bean.NoticesExample;
import com.ysc.apps.online.dao.NoticesMapper;
import com.ysc.apps.online.service.INoticesService;

@Service
public class NoticesServiceImpl implements INoticesService{

	@Autowired
	private NoticesMapper noticesMapper;
	
	@Override
	public List<Notices> findAll() throws Exception {
		NoticesExample example=new NoticesExample();
		return noticesMapper.selectByExample(example);
	}

	@Override
	public Notices findById(long id) throws Exception {
		return noticesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Notices> query(String keywords) throws Exception {
		NoticesExample example=new NoticesExample();
		example.createCriteria().andNoticenameLike(keywords);
		return noticesMapper.selectByExample(example);
	}



	@Override
	public void deleteById(long id) throws Exception {
		noticesMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		for(Long id:ids){
			noticesMapper.deleteByPrimaryKey(id);
		}
		
	}

	@Override
	public void saveOrUpdate(Notices notices) throws Exception {
		if (notices.getId()!=null) {
			noticesMapper.updateByPrimaryKey(notices);
		} else {
			noticesMapper.insert(notices);
		}
		
	}

}
