package com.victus.applied.service;

import com.victus.applied.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void save(User user);

    User findByUsername(String username);

    List<User> findAll();
}
