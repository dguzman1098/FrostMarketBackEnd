package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.users.User;
import com.example.stockmarketapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("FrostMarket/")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("users/{id}")
    public ResponseEntity<?> findUserById(User user, @PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(user, id));
    }

    @GetMapping("users")
    public ResponseEntity<?> findAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("users")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @PutMapping("users/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable Long id) {
        return ResponseEntity.ok(userService.updateUser(user, id));
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}
