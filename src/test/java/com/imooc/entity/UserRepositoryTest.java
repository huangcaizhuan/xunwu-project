package com.imooc.entity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.ApplicationTest;
import com.imooc.repository.UserRepository;

public class UserRepositoryTest extends ApplicationTest{

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindOne() {
		User user = userRepository.findOne(1L);
	}
}
