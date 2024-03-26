package com.upendra.rai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upendra.rai.mysql.entities.Student;
import com.upendra.rai.mysql.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Student saveStudent(Student student) {
		Student saveStudent= studentRepository.save(student);
		 return saveStudent;
	}

	public Student getByStudentId(Long id) {
		Optional<Student> getStudent = studentRepository.findById(id);
		if(getStudent.isPresent()) {
			return getStudent.get();
		}else {
			throw new RuntimeException("Employee not found with id "+id);
		}
	}

	public void deleteByStudentId(Long id) {
		Optional<Student> getStudent = studentRepository.findById(id);
		studentRepository.delete(getStudent.get());
		
	}

}
