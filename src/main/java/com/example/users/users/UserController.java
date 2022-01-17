package com.example.users.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public UserResponse getUserBtId(@PathVariable int id){
        UserResponse userResponse = new UserResponse(id, "Stroa", "t.sappalunn@gmail.com");
        return  userResponse;
    }
}
