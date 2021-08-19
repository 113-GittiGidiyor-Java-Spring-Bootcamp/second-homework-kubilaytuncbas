package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.PermanentInstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PermanentInstructorDao implements BaseDao<PermanentInstructor>{
    @Override
    public List<PermanentInstructor> findAll() {
        return null;
    }

    @Override
    public PermanentInstructor findById(int id) {
        return null;
    }

    @Override
    public void save(PermanentInstructor object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
