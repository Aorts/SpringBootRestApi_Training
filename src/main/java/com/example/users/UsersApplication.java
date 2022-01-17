package com.example.users;

import java.util.Scanner;
import com.example.users.users.TableUser;
import com.example.users.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import javax.annotation.PostConstruct;


@SpringBootApplication
public class UsersApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialData(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String username = scanner.next();

		System.out.print("Enter your email: ");
		String email = scanner.next();
		TableUser tableUser = new TableUser(1, username, email);

		userRepository.save(tableUser);
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(UsersApplication.class, args);
	}

}
