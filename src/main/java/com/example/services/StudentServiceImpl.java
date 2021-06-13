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
public class StudentServiceImpl implements StudentService {
    List<Student> students;

    public StudentServiceImpl() {
        students = new ArrayList<>();
        
        students.add(new Student("111", "Noor Khan", "MS (CS)", "2017", "Computer Science", "School of CS and Engineering Beihang University Beijing"));
    }

    public List<Student> getStudents() {
        return students;
    }
    
}
