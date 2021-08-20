package com.example.patikadevodev2.dao;

import com.example.patikadevodev2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class UserDaoJpa implements UserDao<User>{

    EntityManager entityManager;
    @Autowired
    public UserDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User u",User.class).getResultList();
    }

    @Override
    public User findById(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public User save(User user) {
        return entityManager.merge(user);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(id);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
}
