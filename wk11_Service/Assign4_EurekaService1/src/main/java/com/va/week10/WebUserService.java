package com.va.week10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebUserService {

    @Autowired
    private WebUserRepository webUserRepository;

    public WebUser insertUser(WebUser user) {
        return webUserRepository.save(user);
    }

    public List<WebUser> getAllUsers() {
        return webUserRepository.findAll();
    }
}
