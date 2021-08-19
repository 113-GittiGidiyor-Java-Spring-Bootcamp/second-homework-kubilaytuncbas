package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.VisitingResearcher;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VisitingResearcherDao implements BaseDao<VisitingResearcher>{
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
}
