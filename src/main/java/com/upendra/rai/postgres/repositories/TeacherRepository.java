package com.upendra.rai.postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upendra.rai.postgres.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
