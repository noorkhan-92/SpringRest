/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.entities.Course;
import com.example.entities.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    List<Student> students;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        
        list.add(new Course(120, "Object Oriented Programming Java", "Basic OOP in Java", "Noor Khan"));
        list.add(new Course(121, "Webapp in Spring", "developing web apps in spring boot", "Professor Hu Kai"));
        
    }
    
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        
        Course course = null;
        for(Course c : list) {
        if(c.getId() == courseId){
            course = c;
        }
        }
        
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
    
}
