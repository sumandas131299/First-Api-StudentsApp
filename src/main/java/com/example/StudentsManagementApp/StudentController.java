package com.example.StudentsManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String AddStudent(@RequestBody Student Student){
        return studentService.addStudent(Student);


    }


    @GetMapping("/getbypath/{id}")
    public Student getStudentusingpath(@PathVariable("id") int regNo){
        return studentService.getStudentPath(regNo);

    }

    @PostMapping("/updateAge/{id}/{age}")
    public Student updateAge(@PathVariable("id") int regNo,@PathVariable("age") int newAge){
        return studentService.updateAge(regNo,newAge);

    }

    @DeleteMapping("/deleteStudentpath/{id}")
    public String deleteStudentpath(@PathVariable("id")int regNo){
        return studentService.deleteStudentpath(regNo);

    }

    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id")int regNo){
        return studentService.deleteStudent(regNo);

    }

    @PostMapping("/updateCourse")
    public Student updateCourse(@RequestParam("id")int regNo,@RequestParam("c")String newCourse){
        return studentService.updateCourse(regNo,newCourse);

    }
    @PostMapping("/updateCoursepath/{id}/{c}")
    public Student updateCoursepath(@PathVariable("id")int regNo,@PathVariable("c")String newCourse){
        return  studentService.updateCoursepath(regNo,newCourse);

    }

    @PostMapping("/changeCourseAge")
    public Student changeCourseAge(@RequestParam("id") int regNo,@RequestBody Student Student){
        return studentService.changeCourseAge(regNo,Student);
    }

}

