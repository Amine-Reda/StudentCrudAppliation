package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;

@Repository
public interface IStudent extends JpaRepository<Student, Integer> {
	public Student findByLastName(String lastName);
}
