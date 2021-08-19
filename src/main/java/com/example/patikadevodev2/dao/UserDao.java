package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDao implements BaseDao<User>{
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
