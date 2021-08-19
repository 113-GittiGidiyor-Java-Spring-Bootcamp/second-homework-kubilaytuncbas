package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.service.PermanentInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permanents")
public class PermanentInstructorController {

    PermanentInstructorService permanentInstructorService;

    @Autowired
    public PermanentInstructorController(PermanentInstructorService permanentInstructorService) {
        this.permanentInstructorService = permanentInstructorService;
    }
}
