package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Course;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseDaoJpa implements CourseDao<Course>{

    private EntityManager entityManager;

    @Autowired
    public CourseDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("from Course c",Course.class).getResultList();
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
    public void update(int id) {

    }
}
