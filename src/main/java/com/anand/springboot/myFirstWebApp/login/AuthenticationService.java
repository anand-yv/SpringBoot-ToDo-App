package com.anand.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String user, String password) {
        boolean isValidUser = user.equals("anand");
        boolean isValidPassword = password.equals("oops");
        return isValidUser && isValidPassword;
    }
}
