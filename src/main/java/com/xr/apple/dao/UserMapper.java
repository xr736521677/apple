package com.xr.apple.dao;



import org.apache.ibatis.annotations.Mapper;

import com.xr.apple.entity.User;

@Mapper
public interface UserMapper {
	void insert(User user);
}
