package com.example.users.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //@Autowired
    //private UserResitory userResitory;

    public UserResponse findUserById(int id){
        UserResponse userResponse = new UserResponse(id , "Stroa", "t.sappalunn@gmail.com");
        return userResponse;
    }
}
