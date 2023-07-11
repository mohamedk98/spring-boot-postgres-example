package com.demo.pgExample.services;

import org.springframework.stereotype.Repository;

import com.demo.pgExample.dao.StudentDao;
import com.demo.pgExample.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentService implements StudentDao {
    private EntityManager entitiyManager;

    @AutoWired
    public StudentService(EntityManager entityManager) {
        this.entitiyManager = entityManager;

    } 

    @Override
    @Transactional
    public void save(Student student) {

        entitiyManager.persist((student));
    }
}
