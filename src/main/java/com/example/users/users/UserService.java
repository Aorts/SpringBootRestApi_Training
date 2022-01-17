package com.example.users.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    public UserService(UserRepository UserRepository){
        this.UserRepository = UserRepository;
    }
    public UserResponse findUserById(int id){
        Optional<TableUser> result = UserRepository.findById(id);
        UserResponse userResponse = new UserResponse(result.get().getId(), result.get().getName(), result.get().getEmail());
        return userResponse;
    }
}
