package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.PermanentInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PermanentInstructorDaoJpa implements PermanentInstructorDao<PermanentInstructor>{

    EntityManager entityManager;

    @Autowired
    public PermanentInstructorDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<PermanentInstructor> findAll() {
        return entityManager.createQuery("from PermanentInstructor p",PermanentInstructor.class).getResultList();
    }

    @Override
    public PermanentInstructor findById(int id) {
        return null;
    }

    @Override
    @Transactional
    public PermanentInstructor save(PermanentInstructor object) {
        return entityManager.merge(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        entityManager.remove(id);
    }

    @Override
    @Transactional
    public void update(PermanentInstructor permanentInstructor) {
        entityManager.merge(permanentInstructor);
    }
}
