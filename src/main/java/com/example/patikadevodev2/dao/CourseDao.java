package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseDao implements BaseDao<Course>{
    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public void save(Course object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
