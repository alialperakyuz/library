package com.alialperakyuz.library.api.capability;

import com.alialperakyuz.library.model.dto.UserDto;
import com.alialperakyuz.library.model.jpa.User;
import com.alialperakyuz.library.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCapability {
    @Autowired
    private HelloService userService;

    @PostMapping("/create")
    public ResponseEntity <UserDto> createUser(@Valid @RequestBody UserDto user){
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/{userId}")
    public ResponseEntity <List<User>> getUserByUserId(String username){

        return new ResponseEntity<>(userService.getUserByUsername(username), HttpStatus.OK);
    }
/*
    @PostMapping
    public ResponseEntity <UserDTO> createUser(@RequestBody  UserDTO userDTO){
        UserDTO createdUserDTO = userService.createUser(userDTO);
        return new ResponseEntity<>(createdUserDTO,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity <UserDTO> updateUser(@RequestBody  UserDTO userDTO){
        UserDTO updatedUserDTO = userService.createUser(userDTO);
        return new ResponseEntity<>(updatedUserDTO,HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

 */
}
