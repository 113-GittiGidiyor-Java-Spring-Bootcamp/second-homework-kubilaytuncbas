package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
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
        return entityManager.find(Course.class,id);
    }

    @Override
    @Transactional
    public Course save(Course object) {
        return entityManager.merge(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        entityManager.remove(id);
    }

    @Transactional
    @Override
    public void update(Course course) {
        entityManager.merge(course);
    }
}
