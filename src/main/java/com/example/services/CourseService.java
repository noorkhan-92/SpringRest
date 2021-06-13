package com.example.services;

import com.example.entities.Course;
import java.util.List;

public interface CourseService {

public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);
    
}
