package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Student;

import java.util.List;

public class StudentDaoJpa implements StudentDao<Student>{

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void save(Student object) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(int id) {

    }
}
