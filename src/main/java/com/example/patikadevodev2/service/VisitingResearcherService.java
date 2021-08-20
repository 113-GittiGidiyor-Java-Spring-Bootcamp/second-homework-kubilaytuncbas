package com.example.patikadevodev2.service;

import com.example.patikadevodev2.dao.VisitingResearcherDao;
import com.example.patikadevodev2.model.VisitingResearcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitingResearcherService implements BaseService<VisitingResearcher> {
    VisitingResearcherDao visitingResearcherDao;

    @Autowired
    public VisitingResearcherService(VisitingResearcherDao visitingResearcherDao) {
        this.visitingResearcherDao = visitingResearcherDao;
    }

    @Override
    public List<VisitingResearcher> findAll() {
        return visitingResearcherDao.findAll();
    }

    @Override
    public VisitingResearcher findById(int id) {
        return (VisitingResearcher) visitingResearcherDao.findById(id);
    }

    @Override
    public VisitingResearcher save(VisitingResearcher visitingResearcher) {
        return (VisitingResearcher) visitingResearcherDao.save(visitingResearcher);
    }

    @Override
    public void deleteById(int id) {
        visitingResearcherDao.deleteById(id);
    }

    @Override
    public void update(VisitingResearcher visitingResearcher) {
        visitingResearcherDao.update(visitingResearcher);
    }
}
