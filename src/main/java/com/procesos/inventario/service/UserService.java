package com.procesos.inventario.service;

import com.procesos.inventario.model.User;
import com.procesos.inventario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public User createUser(@RequestBody User user){

        return userRepository.save(user);
    }

    public User getUserById(Long id){

        return userRepository.findById(id).get();
    }

    public User updateUser(@RequestBody User user, Long id){
        if(userRepository.existsById(id)){
            User userBd = userRepository.findById(id).get();
            userBd.setFistName(user.getFistName());
            userBd.setLastName(user.getLastName());
            userBd.setAddress(user.getAddress());
            userBd.setEmail(user.getEmail());
            userBd.setPhone(user.getPhone());
            return userRepository.save(userBd);
        }else {
            return null;
        }
    }

    public Boolean deleteUserByid(Long id){
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
