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

import com.upendra.rai.postgres.entities.Teacher;
import com.upendra.rai.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/all")
	public List<Teacher> getAllTeacher() {
		return teacherService.getAllTeacher();
	}

	@GetMapping("/{id}")
	public Teacher getByTeacherId(@PathVariable Long id) {
		return teacherService.getByTeacherId(id);
	}

	@PostMapping
	public Teacher saveTeacher(@RequestBody Teacher student) {
		return teacherService.saveTeacher(student);
	}

	@DeleteMapping("/{id}")
	public void deleteByTeacherId(@PathVariable Long id) {
		teacherService.deleteByTeacherId(id);
	}

}
