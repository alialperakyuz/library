package com.alialperakyuz.library.service.service;

import com.alialperakyuz.library.model.dto.UserDto;
import com.alialperakyuz.library.model.jpa.User;
import com.alialperakyuz.library.service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class HelloService {

	@Autowired
	IUserRepository userRepository;

	public String sayHello(){
		return "Servis katmanından selamlar.";
	}
	public String getUserByUsername(String username){
		List<User> userCollection = userRepository.findAll();
		StringBuilder users = new StringBuilder();
		userCollection.forEach(u -> users.append(u.toString()));
		return users.toString();
	}
	public void saveUser(UserDto userDto){
		User user = userDto.toUser();
		userRepository.save(user);
	}
}
