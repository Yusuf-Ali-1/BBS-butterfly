package com.tts.issuetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tts.issuetracker.Repository.UserRepository;
import com.tts.issuetracker.entity.User;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
 
	public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    private UserRepository userRepository;
 
    @GetMapping("/users")
    public List<User> getUsers() {
    	
        return (List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    	System.out.println("ACTUALLY GETTING POST MAPPING FOR addUser");
    	System.out.println(user);
        userRepository.save(user);
    }
    
    @DeleteMapping(value="/users")
    void deleteUser(@RequestBody User user) {	
    	System.out.println("ACTUALLY GETTING INTO DELETE MAPPING FOR deleteUser");
		userRepository.delete(user); 
		System.out.println(user);
		userRepository.findAll();

	}
    
    
    
    
}
