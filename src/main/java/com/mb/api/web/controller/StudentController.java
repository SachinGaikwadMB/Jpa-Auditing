package com.mb.api.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mb.api.business.service.StudentService;
import com.mb.api.web.model.StudentModel;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController
{

	@Autowired
	private StudentService studentService;

	@PostMapping
	public ResponseEntity<String> saveStudent(@RequestBody StudentModel studentModel)
	{
		return new ResponseEntity<>(studentService.saveStudent(studentModel), HttpStatus.OK);
	}

}
