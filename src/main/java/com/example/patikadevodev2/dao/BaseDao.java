package com.example.patikadevodev2.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();
    T findById(int id);
    void save(T object);
    void deleteById(int id);
}
