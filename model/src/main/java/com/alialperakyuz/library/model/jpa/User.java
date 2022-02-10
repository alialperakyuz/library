package com.alialperakyuz.library.model.jpa;

import com.alialperakyuz.library.model.dto.enums.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(indexes = {
        @Index(name = "uniqueIndex_id", columnList = "id", unique = true),
        @Index(name = "uniqueIndex_username-mail", columnList = "username, mail", unique = true),
        @Index(name = "uniqueIndex_username", columnList = "username", unique = true),
        @Index(name = "uniqueIndex_mail", columnList = "mail", unique = true),
})
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    @Column(unique = true, updatable = false,nullable = false)
    private String username;
    @Column(unique = true,nullable = false)
    private String mail;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    @Column(updatable = false)
    private OffsetDateTime createdDate;
    private OffsetDateTime updateDate;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                ", status=" + status +
                ", createdDate=" + createdDate +
                ", updateDate=" + updateDate +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
