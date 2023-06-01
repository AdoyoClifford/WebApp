package com.adoyo.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
    public boolean authenticate(String username, String password) {
        Boolean isValidUserName = username.equalsIgnoreCase("Adoyo");
        Boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidPassword && isValidUserName;
    }
}
