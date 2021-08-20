package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.VisitingResearcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class VisitingResearcherDaoJpa implements VisitingResearcherDao<VisitingResearcher>{
    EntityManager entityManager;
    @Autowired
    public VisitingResearcherDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<VisitingResearcher> findAll() {
        return entityManager.createQuery("from VisitingResearcher v",VisitingResearcher.class).getResultList();
    }

    @Override
    public VisitingResearcher findById(int id) {
        return entityManager.find(VisitingResearcher.class,id);
    }

    @Override
    public VisitingResearcher save(VisitingResearcher object) {
        return entityManager.merge(object);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(id);
    }

    @Override
    public void update(VisitingResearcher visitingResearcher) {
        entityManager.merge(visitingResearcher);

    }
}
