package com.demo.pgExample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pgExample.dao.StudentDao;
import com.demo.pgExample.entity.Student;
import com.demo.pgExample.exceptions.NotFoundException;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

// @Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {
    // private EntityManager entitiyManager;

    // @AutoWired
    // public StudentRepository(EntityManager entityManager) {
    //     this.entitiyManager = entityManager;

    // }

    // @Override
    // @Transactional
    // public void save(Student student) {

    //     entitiyManager.persist((student));
    // }

    // @Override
    // public Student findById(int id) {
    //     Student foundStudent = entitiyManager.find(Student.class, id);
    //     if (foundStudent == null) {
    //         throw new NotFoundException("Student with id " + id + " was not found");
    //     }
    //     return foundStudent;
    // }

    // @Override
    // public List<Student> findAll() {
    //     return entitiyManager.createQuery("FROM Student", Student.class).getResultList();
    // }

    // @Override
    // public String update(int id, Student data) {
    //     Student existingStudent = findById(id);
    //     if (existingStudent == null) {
    //         throw new NotFoundException("Student with id " + id + " was not found");
    //     }

    //     existingStudent = data;
    //     this.entitiyManager.merge(existingStudent);

    //     return "Student updated successfully";
    // }

}
