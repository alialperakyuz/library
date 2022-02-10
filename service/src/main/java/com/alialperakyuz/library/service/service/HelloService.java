package com.alialperakyuz.library.service.service;

import com.alialperakyuz.library.model.dto.enums.Status;
import com.alialperakyuz.library.model.dto.UserDto;
import com.alialperakyuz.library.model.jpa.User;
import com.alialperakyuz.library.service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class HelloService {

	@Autowired
	IUserRepository userRepository;

	public String sayHello(){
		return "Servis katmanından selamlar.";
	}
	public List<User> getUserByUsername(String username){
		List<User> userCollection = userRepository.findAll();
		return userCollection;
	}
	public void saveUser(UserDto userDto){
		User user = userDto.toUser();
		userRepository.save(user);
	}

	public void createUser(UserDto user) {
		User userDb = user.toUser();
		userDb.setStatus(Status.ACTIVE);
		userDb.setCreatedDate(OffsetDateTime.now());
		userDb.setUpdateDate(OffsetDateTime.now());
		userRepository.save(userDb);
	}
}
