package com.example.patikadevodev2.service;

import com.example.patikadevodev2.dao.CourseDao;
import com.example.patikadevodev2.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course>{
    CourseDao courseDao;

    @Autowired
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
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

    @Override
    public void update(Course id) {

    }
}
