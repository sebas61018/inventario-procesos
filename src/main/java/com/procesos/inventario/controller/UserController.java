package com.procesos.inventario.controller;


import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable long id){
        User user = new User(id, "Pepito", "Perez","cr 39 #19-9", "pepito@gmail.com", "123456789" , "@12345", "100162145");
        return user;
    }
}
