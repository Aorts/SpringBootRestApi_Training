package com.example.users.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_get_user_id_1(){
        UserResponse result = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1,result.getId());
        assertEquals("Stroa", result.getName());
        assertEquals("t.sappalunn@gmail.com", result.getEmail());
    }
}