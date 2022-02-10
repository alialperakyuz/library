package com.alialperakyuz.library.model.contract.capability;

import com.alialperakyuz.library.model.dto.enums.Channel;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class GenericRequestHeader implements Serializable {
    private static final long serialVersionUID = -7986293475376223604L;
    private Channel channel;
    private String userName;
    private String password;
    private String ipAddress;
    private String language;
    private String sessionToken;
    private OffsetDateTime requestDate = OffsetDateTime.now(ZoneId.systemDefault());

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public OffsetDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(OffsetDateTime requestDate) {
        this.requestDate = requestDate;
    }
}
