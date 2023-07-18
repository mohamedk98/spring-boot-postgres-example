package com.demo.pgExample;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class PgExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgExampleApplication.class, args);
	}

	// It do something on bean initalizing, this is the command line runner
	// @Bean
	// public CommandLineRunner commandLineRunner(StudentService studentService) {
	// 	return runner -> {
	// 		getAllStudents(studentService);
	// 	};
	// }

	// private void createStudentAndGetById(StudentService studentService) {
	// 	Student newStudent = new Student("Mohamed", "Khaled", "mohamedk@gmail.com");

	// 	studentService.save(newStudent);
	// 	System.out.println("Student created with id :" + newStudent.getId());

	// 	Student currentStudent = studentService.findById(newStudent.getId());
	// 	System.out.println("The Student Data after fetching is: " + currentStudent);
	// }

	// public List<Student> getAllStudents(StudentService studentService) {
	// 	List<Student> students = studentService.findAll();
	// 	System.out.println(students);
	// 	return students;
	// }
	
}
