package com.upendra.rai.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upendra.rai.mysql.entities.Student;
import com.upendra.rai.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/all")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public Student getByStudentId(@PathVariable Long id) {
		return studentService.getByStudentId(id);
	}

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteByStudentId(@PathVariable Long id) {
		 studentService.deleteByStudentId(id);
	}

}
