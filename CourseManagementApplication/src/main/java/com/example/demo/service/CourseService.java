package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseService {

	 void addCourse(Course course);
     List<Course> display();
}
