package com.example.StudentsManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {


    HashMap<Integer,Student> db = new HashMap<>();

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo);
    }

    @PostMapping("/add")
    public String AddStudent(@RequestBody Student Student){
        db.put(Student.getRegNo(),Student);
        return "Student is added successfully";
    }


    @GetMapping("/getbypath/{id}")
    public Student getStudentusingpath(@PathVariable("id") int regNo){
        return db.get(regNo);
    }

    @PostMapping("/updateAge/{id}/{age}")
    public Student updateAge(@PathVariable("id") int regNo,@PathVariable("age") int newAge){
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    @DeleteMapping("/deleteStudentpath/{id}")
    public String deleteStudentpath(@PathVariable("id")int regNo){
        db.remove(regNo);
        return "Student is deleted successfully";
    }

    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id")int regNo){
        db.remove(regNo);
        return "Student is deleted successfully";
    }

    @PostMapping("/updateCourse")
    public Student updateCourse(@RequestParam("id")int regNo,@RequestParam("c")String newCourse){

        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }
    @PostMapping("/updateCoursepath/{id}/{c}")
    public Student updateCoursepath(@PathVariable("id")int regNo,@PathVariable("c")String newCourse){

        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    @PostMapping("/changeCourseAge")
    public Student changeCourseAge(@RequestParam("id") int regNo,@RequestBody Student Student){
        db.get(regNo).setCourse(Student.getCourse());
        db.get(regNo).setAge(Student.getAge());
        return db.get(regNo);
    }

}

