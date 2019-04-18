package com.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.learn.dao.UserTMapper;
import com.learn.model.UserT;
import com.learn.service.UserTService;

public class UserTServiceImpl implements UserTService{
	@Autowired
	private UserTMapper userTMapper;
	@Override
	public UserT selectByPrimaryKey(Integer id) {
		return userTMapper.selectByPrimaryKey(id);
	}

}
