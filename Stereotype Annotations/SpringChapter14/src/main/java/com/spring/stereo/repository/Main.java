package com.spring.stereo.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
 public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

     UserRepository userRepository = context.getBean(UserRepository.class);

     User user1 = new User();
     user1.setUsername("Shaun");
     userRepository.save(user1);

     User foundUser = userRepository.findById(1);
     System.out.println("Found user: " + foundUser);

     System.out.println("All users: " + userRepository.findAll());
 }
}

