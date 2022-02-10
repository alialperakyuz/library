package com.alialperakyuz.library.model.dto;

import com.alialperakyuz.library.model.jpa.User;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class UserDto implements Serializable {
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String surname;
    @NotNull
    @NotEmpty
    private String username;
    @NotNull
    @NotEmpty
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

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
        user.setMail(this.mail);
        return user;
    }
}
