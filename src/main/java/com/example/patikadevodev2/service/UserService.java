package com.example.patikadevodev2.service;

import com.example.patikadevodev2.dao.UserDao;
import com.example.patikadevodev2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements BaseService<User> {
    UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void save(User object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
