package com.example.CourseRegSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseRegSystem.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,String>{

}
