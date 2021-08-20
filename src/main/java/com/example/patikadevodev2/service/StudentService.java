package com.example.patikadevodev2.service;

import com.example.patikadevodev2.dao.StudentDao;
import com.example.patikadevodev2.model.Course;
import com.example.patikadevodev2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {

    StudentDao studentDao;
    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(int id) {
        return (Student) studentDao.findById(id);
    }

    @Override
    public Student save(Student object) {
        return (Student) studentDao.save(object);
    }

    @Override
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }
}
