package com.demo.pgExample.dao;

import java.util.List;

import com.demo.pgExample.entity.Student;

public interface StudentDao {
    
    void save(Student student);

    Student findById (int id);

    List<Student> findAll();

    String update(int id, Student data);
}
