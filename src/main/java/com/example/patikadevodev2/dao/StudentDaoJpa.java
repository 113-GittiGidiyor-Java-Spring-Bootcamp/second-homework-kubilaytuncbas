package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class StudentDaoJpa implements StudentDao<Student>{

    EntityManager entityManager;
    @Autowired
    public StudentDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student s",Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public Student save(Student object) {
        return entityManager.merge(object);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(id);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }
}
