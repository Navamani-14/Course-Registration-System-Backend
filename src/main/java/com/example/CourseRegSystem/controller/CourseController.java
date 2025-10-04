package com.example.CourseRegSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseRegSystem.model.Course;
import com.example.CourseRegSystem.model.CourseRegistry;
import com.example.CourseRegSystem.service.CourseService;

@RestController
@CrossOrigin(origins="http://localhost:5500")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/courses")
	public List<Course> availableCourses(){
		return courseService.availableCourses();
	}
	
	@GetMapping("/courses/enrolled")
	public List<CourseRegistry> enrolledCourses(){
		return courseService.enrolledCourses();
	}
	
	@PostMapping("/courses/register")
	public String enrollCourses(@RequestParam("name") String name,
			@RequestParam("emailId") String emailId,
			@RequestParam("courseName") String courseName) {
		courseService.enrollCourses(name,emailId,courseName);
		return "Congratulation! "+name+" Enrollment successfull for "+courseName;
	}

}
