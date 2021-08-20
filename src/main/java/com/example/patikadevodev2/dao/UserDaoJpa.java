package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.User;

import java.util.List;

public class UserDaoJpa implements UserDao<User>{
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

    @Override
    public void update(int id) {

    }
}
