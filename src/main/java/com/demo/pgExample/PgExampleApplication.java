package com.demo.pgExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.pgExample.dao.StudentDao;
import com.demo.pgExample.entity.Student;

@SpringBootApplication
public class PgExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgExampleApplication.class, args);
	}

	// It do something on bean initalizing, this is the command line runner
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDao studentDao) {
		Student newStudent = new Student("Mohamed", "Khaled", "mohamedk@gmail.com");

		studentDao.save(newStudent);
		System.out.println("Student created with id :" + newStudent.getId());
	}
}
