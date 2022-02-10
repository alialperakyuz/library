package com.alialperakyuz.library.model.jpa;

import com.alialperakyuz.library.model.dto.enums.Status;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
public class UserPassword implements Serializable {

    private static final long serialVersionUID = 7966688100926726966L;
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    private OffsetDateTime createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
