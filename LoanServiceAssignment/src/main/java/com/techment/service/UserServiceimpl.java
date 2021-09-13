package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IUserdao;
import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.util.SiteUtil;

@Service
public class UserServiceimpl implements IUserService {

	@Autowired
	IUserdao IUserdao;
	
	@Autowired
	SiteUtil siteUtil; 
	
	@Override
	public UserDto login(String username, String password) {

		User user = IUserdao.findByUsernameAndPassword(username, password).get() ;
		String token = siteUtil.generateToken();
		user.setToken(token);
		IUserdao.save(user);
		
		
		UserDto userDto = new UserDto(user.getId(), user.getUsername(), user.getPassword(), token);
		
		return userDto;
	}

	



	
}
