package com.demo.pgExample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pgExample.entity.Student;
import com.demo.pgExample.exceptions.NotFoundException;
import com.demo.pgExample.repository.AutoWired;

import com.demo.pgExample.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @AutoWired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> getSingleStudent(Integer id) {
        Optional<Student> student = this.studentRepository.findById(id);
        if (!student.isPresent()) {
            throw new NotFoundException("student isn't found");
        } else {
            return student;
        }

    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public String addStudent(Student data) {
        this.studentRepository.save(data);
        return "Student added successfully";
    }

    public String update(Integer id, Student data) {
        Optional<Student> existingStudent = this.getSingleStudent(id);

        existingStudent.ifPresent(student -> {
            this.studentRepository.save(data);
        });
        return "Updated successfully";
    }

}