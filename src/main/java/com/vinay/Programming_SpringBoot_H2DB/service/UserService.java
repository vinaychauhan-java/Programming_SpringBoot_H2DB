package com.vinay.Programming_SpringBoot_H2DB.service;

import com.vinay.Programming_SpringBoot_H2DB.domain.User;
import com.vinay.Programming_SpringBoot_H2DB.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(int userId) {
        return userRepository.findById(userId);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.updateUserData(user.getId(), user.getFirstName(), user.getLastName());
    }

    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

}

