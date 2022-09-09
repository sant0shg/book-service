package com.books.booksservice.controller;

import com.books.booksservice.entity.User;
import com.books.booksservice.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserProfileService userProfileService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUserProfile(){
        User user = userProfileService.getProfile("1");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
