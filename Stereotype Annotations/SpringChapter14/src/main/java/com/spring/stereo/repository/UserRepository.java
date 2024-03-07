package com.spring.stereo.repository;


import java.util.List;

public interface UserRepository {
	 void save(User user);
	 User findById(int id);
	 List<User> findAll();
}
