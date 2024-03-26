package com.upendra.rai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upendra.rai.postgres.entities.Teacher;
import com.upendra.rai.postgres.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Teacher> getAllTeacher() {
		return teacherRepository.findAll();
	}

	public Teacher saveTeacher(Teacher teacher) {
		Teacher saveTeacher= teacherRepository.save(teacher);
		 return saveTeacher;
	}

	public Teacher getByTeacherId(Long id) {
		Optional<Teacher> getTeacher = teacherRepository.findById(id);
		if(getTeacher.isPresent()) {
			return getTeacher.get();
		}else {
			throw new RuntimeException("Teacher not found with id "+id);
		}
	}

	public void deleteByTeacherId(Long id) {
		Optional<Teacher> getTeacher = teacherRepository.findById(id);
		teacherRepository.delete(getTeacher.get());
		
	}

}
