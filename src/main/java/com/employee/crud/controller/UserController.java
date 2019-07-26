package com.employee.crud.controller;

import com.employee.crud.entity.User;
import com.employee.crud.exception.BusinessException;
import com.employee.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/employees")
    public ResponseEntity getAllUser() {
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/employees/{userId}")
    public ResponseEntity updateUserById(@PathVariable int userId, @RequestBody User user) throws BusinessException {
        userService.updateUserById(userId, user);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/employees/{userId}")
    public ResponseEntity deleteUserById(@PathVariable int userId) throws BusinessException {
        userService.deleteById(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
