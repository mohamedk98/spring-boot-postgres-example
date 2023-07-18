// package com.demo.pgExample.controllers;

// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.demo.pgExample.entity.Student;
// import com.demo.pgExample.repository.AutoWired;
// import com.demo.pgExample.services.StudentService;
// import org.springframework.web.bind.annotation.PutMapping;

// @RestController
// @RequestMapping("/api/students")
// public class StudentController {

//     private StudentService studentService;

//     @AutoWired
//     public StudentController(StudentService studentService) {
//         this.studentService = studentService;
//     }

//     @GetMapping("")
//     public List<Student> getAllStudents() {
//         List<Student> allStudents = this.studentService.getAllStudents();
//         System.out.println();
//         return allStudents;
//     }

//     @GetMapping("/{studentId}")
//     public Student getOneStudent(@PathVariable int studentId) {
//         Student queredStudent = this.studentService.getSingleStudent(studentId);

//         return queredStudent;
//     }

//     @PostMapping("")
//     public String addStudent(@RequestBody Student data) {
//         return this.studentService.addStudent(data);
//     }

//     @PutMapping("/{studentId}")
//     public String putMethodName(@PathVariable int studentId, @RequestBody Student data) {
//         return this.studentService.update(studentId, data);
//     }

// }
