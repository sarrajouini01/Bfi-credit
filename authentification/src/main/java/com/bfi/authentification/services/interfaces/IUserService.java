package com.bfi.authentification.services.interfaces;
import com.bfi.authentification.entities.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    User getUserByEmail(String email);
}

