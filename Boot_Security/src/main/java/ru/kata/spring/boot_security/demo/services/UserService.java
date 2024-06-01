package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User showUser(Long id);
    void createUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, User user);
    Optional<User> findUserByUsername(String username);
}
