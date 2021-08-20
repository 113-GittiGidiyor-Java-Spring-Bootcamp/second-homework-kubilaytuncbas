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
        return null;
    }

    @Override
    public VisitingResearcher findById(int id) {
        return null;
    }

    @Override
    public void save(VisitingResearcher object) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(VisitingResearcher id) {

    }
}
