package com.example.patikadevodev2.service;

import com.example.patikadevodev2.dao.PermanentInstructorDao;
import com.example.patikadevodev2.model.PermanentInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermanentInstructorService implements BaseService<PermanentInstructor> {
    PermanentInstructorDao permanentInstructorDao;

    @Autowired
    public PermanentInstructorService(PermanentInstructorDao permanentInstructorDao) {
        this.permanentInstructorDao = permanentInstructorDao;
    }

    @Override
    public List<PermanentInstructor> findAll() {
        return permanentInstructorDao.findAll();
    }

    @Override
    public PermanentInstructor findById(int id) {
        return (PermanentInstructor) permanentInstructorDao.findById(id);
    }

    @Override
    public PermanentInstructor save(PermanentInstructor permanentInstructor) {
        return (PermanentInstructor) permanentInstructorDao.save(permanentInstructor);
    }

    @Override
    public void deleteById(int id) {
        permanentInstructorDao.deleteById(id);
    }

    @Override
    public void update(PermanentInstructor permanentInstructor) {
        permanentInstructorDao.update(permanentInstructor);
    }
}
