package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {

    CourseService courseService;

    @Autowired
    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }


}
