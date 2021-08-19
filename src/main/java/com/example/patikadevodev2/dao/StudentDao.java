package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDao implements BaseDao<Student> {
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
}
