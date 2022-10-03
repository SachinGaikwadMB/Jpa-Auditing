package com.mb.api.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.api.persistance.entity.Student;
import com.mb.api.persistance.repository.StudentRepository;
import com.mb.api.web.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
   private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public String saveStudent(StudentModel studentModel)
	{
		studentRepository.save(modelMapper.map(studentModel, Student.class));	
		return "Student Saved Successfully";
	}

}
