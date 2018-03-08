package com.xr.apple.Controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.apple.dao.UserMapper;
import com.xr.apple.entity.User;

@Controller
@RequestMapping("Main2")
public class LoginController2 {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/login")
	public String Login(){
		return "login";
	}
	
	@RequestMapping("/loginOut")
	public String LoginOut(){
		return "logOut";
	}
	@RequestMapping("/insertUser")
	public void insertUser(){
		User user = new User();
		user.setName("test");
		user.setCreatetime(Calendar.getInstance().getTime());
		userMapper.insert(user);
	}
}
