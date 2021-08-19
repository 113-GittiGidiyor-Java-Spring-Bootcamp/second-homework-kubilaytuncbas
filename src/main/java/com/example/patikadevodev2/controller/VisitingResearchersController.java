package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.service.VisitinResearcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visiting")
public class VisitingResearchersController {

    VisitinResearcherService visitinResearcherService;

    @Autowired
    public VisitingResearchersController(VisitinResearcherService visitinResearcherService) {
        this.visitinResearcherService = visitinResearcherService;
    }
}
