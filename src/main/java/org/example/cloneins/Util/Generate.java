package org.example.cloneins.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Generate {
    public static String generatePassword (String FullName){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return  encoder.encode(FullName);
    }
    public static boolean  deEncryptPassword (String rawPassword , String password){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(rawPassword, password);
    }
}
