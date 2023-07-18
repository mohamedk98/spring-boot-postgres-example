// package com.demo.pgExample.services;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.demo.pgExample.entity.Student;
// import com.demo.pgExample.repository.AutoWired;
// import com.demo.pgExample.repository.StudentRepository;
// @Service
// public class StudentService {
    
//     private StudentRepository studentRepository;

//     @AutoWired
//     public  StudentService (StudentRepository studentRepository ){
//         this.studentRepository = studentRepository;
//     }

//     public Student getSingleStudent(int id){
//         return this.studentRepository.findById(id);
//     }

//     public List<Student> getAllStudents(){
//         return this.studentRepository.findAll();
//     }

//     public String addStudent(Student data){
//         this.studentRepository.save(data);
//         return "Student added successfully";
//     }

//     public String update(int id,Student data){
//         return this.studentRepository.save(id, data);
//     }
// }
