package com.ysc.apps.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysc.apps.online.bean.User;
import com.ysc.apps.online.bean.UserExample;
import com.ysc.apps.online.dao.UserMapper;
import com.ysc.apps.online.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() throws Exception {
			UserExample example = new UserExample();
			return userMapper.selectByExample(example);
	}

	@Override
	public User findById(long id) throws Exception {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(User user) throws Exception {
		 if(user.getId()!=null){
			 userMapper.updateByPrimaryKey(user);
		 }
		
	}

	@Override
	public void register(User user) throws Exception {
		if(user.getId()==null){
			userMapper.insert(user);
		}
		
	}

	@Override
	public boolean isExist(User user) {
		int isExist = userMapper.isExist(user);
		if(isExist > 0){
			return true;
		}
		return false;
	}

	@Override
	public void deleteById(long id) throws Exception {
		userMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		for(long id : ids){
			userMapper.deleteByPrimaryKey(id);
	}
		
	}

	@Override
	public void saveOrUpdate(User user) throws Exception {
		if (user.getId()!=null) {
			userMapper.updateByPrimaryKey(user);
		} else {
			userMapper.insert(user);
		}
		
	}

}
