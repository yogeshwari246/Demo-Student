package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public void addCourse(Course course) {
       courseRepo.save(course);
	}

	@Override
	public List<Course> display() {
        return courseRepo.findAll();
    }

		
	

}
