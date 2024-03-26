package com.upendra.rai.mysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upendra.rai.mysql.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
