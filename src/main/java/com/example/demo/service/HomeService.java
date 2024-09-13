package com.example.demo.service;

import com.example.demo.Entity.User;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public void register(User user) throws BadRequestException {
        if(!user.getEmail().contains("@gmail.com")){
            throw new BadRequestException("Username must contain @gmail.com ");
        }
    }
}
