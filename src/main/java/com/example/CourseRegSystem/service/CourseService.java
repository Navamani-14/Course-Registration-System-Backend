package com.example.CourseRegSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseRegSystem.model.Course;
import com.example.CourseRegSystem.model.CourseRegistry;
import com.example.CourseRegSystem.repository.CourseRegistryRepo;
import com.example.CourseRegSystem.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
	private CourseRepo courseRepo;
	
    @Autowired
    private CourseRegistryRepo courseRegistryRepo;
    
	public List<Course> availableCourses() {
		return courseRepo.findAll();

}

	public List<CourseRegistry> enrolledCourses() {
		return courseRegistryRepo.findAll();
	}

	public void enrollCourses(String name, String emailId, String courseName) {
		CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
		courseRegistryRepo.save(courseRegistry);
		
	}
}
