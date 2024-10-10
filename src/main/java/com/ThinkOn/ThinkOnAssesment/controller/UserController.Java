package com.ThinkOn.ThinkOnAssesment.controller;

import com.ThinkOn.ThinkOnAssesment.model.User;
import com.ThinkOn.ThinkOnAssesment.response.ApiResponse;
import com.ThinkOn.ThinkOnAssesment.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint to create a new user (POST /users)
    @PostMapping
    public ResponseEntity<ApiResponse> createUser(@Valid  @RequestBody User user) {
        User createdUser = userService.createUser(user);
        ApiResponse response = new ApiResponse("User created successfully", createdUser);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Endpoint to get all users (GET /users)
    @GetMapping
    public ResponseEntity<ApiResponse> getAllUsers() {
        List<User> users = userService.getAllUsers();
        ApiResponse response = new ApiResponse("Retrieved all users successfully", users);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Endpoint to get a specific user by ID (GET /users/{id})
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            ApiResponse response = new ApiResponse("Retrieved user data successfully", user.get());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            ApiResponse response = new ApiResponse("User not found", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to update an existing user (PUT /users/{id})
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updateUser(@Valid  @PathVariable Long id, @RequestBody User updatedUser) {
        User user = userService.updateUser(id, updatedUser);
        ApiResponse response = new ApiResponse("Edited user data", user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Endpoint to delete a user (DELETE /users/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        ApiResponse response = new ApiResponse("Deleted user successfully", null);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }  
}
