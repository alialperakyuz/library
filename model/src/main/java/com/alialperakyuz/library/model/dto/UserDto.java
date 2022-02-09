package com.alialperakyuz.library.model.dto;

import com.alialperakyuz.library.model.jpa.User;

import java.io.Serializable;

public class UserDto implements Serializable {
    private String name;
    private String surname;
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User toUser() {
        User user = new User();
        user.setUsername(this.username);
        user.setName(this.name);
        user.setSurname(this.surname);
        return user;
    }
}
