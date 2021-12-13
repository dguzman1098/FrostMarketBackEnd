package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.users.User;
import com.example.stockmarketapi.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public User createUser(User user) {
        try {
            logger.info("User created");
            return userRepository.save(user);
        } catch (RuntimeException e) {
            logger.info("Unable to Create User");
        }
        return null;
    }

    public User updateUser(User user, Long id) {
        try {
            logger.info("User Updated");
            return userRepository.save(user);
        } catch (RuntimeException e) {
            logger.info("Unable to Update User");
        }
        return null;
    }

    public void deleteUser(Long id) {
        if (!userRepository.findById(id).isEmpty()) {
            logger.info("User found! Removing User at Id: " + id);
            userRepository.deleteById(id);
        } else {
            logger.info("Unable to find user to delete");
        }

    }

    public User getUserById(User user, Long id) {
        //user in database is not empty then return user by id
        if (!userRepository.findById(id).isEmpty()) {
            logger.info("User found at Id: " + id);
            return userRepository.getById(id);
        } else {
            logger.info("Unable to Find User at Id: " + id);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
