package com.va.week10;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "webusers")
public class WebUser {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String loginId;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserState state;

    public WebUser() {}

    public WebUser(String id, String loginId, String password, UserState state) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.state = state;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getLoginId() { return loginId; }
    public void setLoginId(String loginId) { this.loginId = loginId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public UserState getState() { return state; }
    public void setState(UserState state) { this.state = state; }

    @Override
    public String toString() {
        return "WebUser{id='" + id + "', loginId='" + loginId + "', state=" + state + "}";
    }
}
