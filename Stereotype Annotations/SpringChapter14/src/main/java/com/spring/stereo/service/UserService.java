package com.spring.stereo.service;


public class UserService {
 public void addUser(User user) {
     System.out.println("Adding user: " + user);
 }

 public User getUserById(int userId) {
     System.out.println("Getting user by ID: " + userId);
     return null;
 }
}

