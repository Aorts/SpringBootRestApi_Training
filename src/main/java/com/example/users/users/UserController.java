package com.example.users.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public UserResponse getUserBtId(@PathVariable String id){
        // Error RuntimeException
        int _id = -1;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e){
            throw new UserInputInvalidException("Invalid id " + id);
        }
        //UserService userService = new UserService();
        return userService.findUserById(_id);
    }
}
