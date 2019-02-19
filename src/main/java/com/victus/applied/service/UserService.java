package com.victus.applied.service;

import com.victus.applied.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
