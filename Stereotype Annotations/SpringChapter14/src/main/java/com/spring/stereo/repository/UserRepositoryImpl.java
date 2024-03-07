package com.spring.stereo.repository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> userMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public void save(User user) {
        user.setId(nextId++);
        userMap.put(user.getId(), user);
        System.out.println("User saved: " + user);
    }

    @Override
    public User findById(int id) {
        return userMap.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }
}

