package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.model.PermanentInstructor;
import com.example.patikadevodev2.service.PermanentInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permanents")
public class PermanentInstructorController {

    PermanentInstructorService permanentInstructorService;

    @Autowired
    public PermanentInstructorController(PermanentInstructorService permanentInstructorService) {
        this.permanentInstructorService = permanentInstructorService;
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<PermanentInstructor>> findAll(){
        return new ResponseEntity<>(permanentInstructorService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<PermanentInstructor> findPermanentInstructorById(@PathVariable int id){
        return  new ResponseEntity<>(permanentInstructorService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/savePermanentInstructor")
    public PermanentInstructor savePermanentInstructor(PermanentInstructor permanentInstructor){
        return permanentInstructorService.save(permanentInstructor);
    }
    @PostMapping("/deletePermanentInstructor")
    public  void deletePermanentInstructor(int id){
        permanentInstructorService.deleteById(id);
    }
    @PutMapping("/updatePermanentInstructor")
    public void updatePermanentInstructor(PermanentInstructor permanentInstructor){
        permanentInstructorService.update(permanentInstructor);
    }
}
