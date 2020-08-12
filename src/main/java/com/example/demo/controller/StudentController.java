package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IStudent;
import com.example.demo.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudent repoStudent;
	
	@GetMapping(value = "/students")
	public List<Student> getAllStudent(){
		return repoStudent.findAll();
	}
	
	@DeleteMapping(value = "/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		 repoStudent.deleteById(id);
	}
	
	@PostMapping(value = "/students")
	public void addStudent(@RequestBody Student student) {
		repoStudent.save(student);
	}
	
    @PutMapping(value = "/students")
    public void updateStudent(@RequestBody Student student) {
    	 repoStudent.save(student);
    }
	

}
