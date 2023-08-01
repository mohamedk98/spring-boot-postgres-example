package com.demo.pgExample;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoders {
    
    public BCryptPasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }

    public String encodePassword(String password){
        BCryptPasswordEncoder passwordEncoder = passwordEncoder();
        String passwordAfterEncoded = passwordEncoder.encode(password);

        return passwordAfterEncoded;
    }

    public Boolean comparePassword(String enteredPassword, String userPassword){
            BCryptPasswordEncoder passwordEncoder = passwordEncoder();
            Boolean isPasswordMatch = passwordEncoder.matches(enteredPassword,userPassword);
            return isPasswordMatch;
    }
}
