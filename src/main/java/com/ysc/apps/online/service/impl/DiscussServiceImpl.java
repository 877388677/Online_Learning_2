package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.Discuss;
import com.ysc.apps.online.bean.extend.DiscussVM;
import com.ysc.apps.online.dao.DiscussMapper;
import com.ysc.apps.online.dao.extend.DiscussVMMapper;
import com.ysc.apps.online.service.IDiscussService;


@Service
public class DiscussServiceImpl implements IDiscussService{

	@Autowired
	private DiscussVMMapper discussVMMapper;
	
	@Autowired
	private DiscussMapper discussMapper;
	
	@Override
	public DiscussVM selectById(long id) throws Exception {
		return discussVMMapper.selectById(id);
	}

	@Override
	public void saveOrUpdate(Discuss discuss) throws Exception {
		
		if(discuss.getId()!=null){
			discussMapper.updateByPrimaryKey(discuss);
		}else{
			discussMapper.insert(discuss);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		discussMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(Long[] ids) throws Exception {
		for(long id : ids)
			discussMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<DiscussVM> selectAll() throws Exception {
		return discussVMMapper.selectAll();
	}

	@Override
	public List<DiscussVM> selectAllByVideoid(long id) throws Exception {
		return discussVMMapper.selectAllByVideoid(id);
	}

}
