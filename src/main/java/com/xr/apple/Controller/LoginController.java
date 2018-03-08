package com.xr.apple.Controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xr.apple.dao.UserMapper;
import com.xr.apple.entity.User;

@RestController
@RequestMapping("Main")
public class LoginController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/login")
	public ModelAndView Login(){
		ModelAndView mv = new ModelAndView("login");
		return mv;
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
