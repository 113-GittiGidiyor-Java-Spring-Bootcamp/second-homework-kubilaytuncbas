package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.model.Student;
import com.example.patikadevodev2.model.User;
import com.example.patikadevodev2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<User> findStudentById(@PathVariable int id){
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/saveUser")
    public User saveUser(User user){
        return userService.save(user);
    }
    @PostMapping("/deleteUser")
    public  void deleteUser(int id){
        userService.deleteById(id);
    }
    @PutMapping("/updateUser")
    public void updateUser(User user){
        userService.update(user);
    }
}
