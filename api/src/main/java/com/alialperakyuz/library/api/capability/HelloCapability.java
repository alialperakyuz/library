package com.alialperakyuz.library.api.capability;

import com.alialperakyuz.library.model.dto.UserDto;
import com.alialperakyuz.library.service.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloCapability {


    private static final Logger logger = LoggerFactory.getLogger(HelloCapability.class);

    @Autowired
    private HelloService helloService;

    @GetMapping("/get/v1")
    public String sayHello() {
        return this.helloService.sayHello();
    }

    @GetMapping("/user/get/v1")
    public String getUser() {
        logger.debug("getUser servisi çağırıldı");
        UserDto userDto = new UserDto();
        userDto.setName("Alper");
        userDto.setUsername("alialperakyuz");
        userDto.setSurname("Akyüz");
        this.helloService.saveUser(userDto);
        return this.helloService.getUserByUsername(userDto.getUsername());
    }

}
