package com.anand.springboot.myFirstWebApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {
//    InMemoryUserDetailsManager
//    InMemoryUserDetailsManager(UserDetails... users);

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){

        UserDetails user1 = createUser("anand","oops");
        UserDetails user2 = createUser("yadav","123");

        return new InMemoryUserDetailsManager(user1, user2);
    }

    private UserDetails createUser(String username, String password) {
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder)
                .username(username)
                .password(password)
                .roles("USER", "ADMIN")
                .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
