package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" that returns a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
        students.add(new Student("Jim", "Beam"));
        return students;
    }

}
