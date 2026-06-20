package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    @GetMapping("/display")
    public List<Course> displayCourses() {
        return courseService.display();
    }
}

