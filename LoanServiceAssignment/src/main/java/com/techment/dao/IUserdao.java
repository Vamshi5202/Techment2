package com.techment.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.dto.UserDto;
import com.techment.entity.User;

public interface IUserdao extends JpaRepository<User, Integer> {

	Optional<User> findByUsernameAndPassword(String username,String password); 
	Optional<User> findByToken(String token);
}
