package com.alialperakyuz.library.model.contract.capability;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class GenericResponseHeader implements Serializable {


    private static final long serialVersionUID = 1367608413023874521L;
    private boolean success;
    private int errorCode;
    private String message;
    private OffsetDateTime responseDate;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OffsetDateTime getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(OffsetDateTime responseDate) {
        this.responseDate = responseDate;
    }
}
