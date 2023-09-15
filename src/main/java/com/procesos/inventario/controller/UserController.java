package com.procesos.inventario.controller;


import com.procesos.inventario.model.User;
import com.procesos.inventario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("users")
    public User create(User user){
        return userService.createUser(user);
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    @PutMapping("users/{id}")
    public User update(User user, @PathVariable Long id){
        return userService.updateUser(user,id);
    }

    @DeleteMapping("users/{id}")
    public Boolean delete(@PathVariable Long id){
        return userService.deleteUserByid(id);
    }
}
