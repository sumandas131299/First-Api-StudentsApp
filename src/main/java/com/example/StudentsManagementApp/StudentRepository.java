package com.example.StudentsManagementApp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    HashMap<Integer,Student> db = new HashMap<>();
    public Student getStudent(int regNo){
        return db.get(regNo);
    }

    public String addStudent(Student student) {
        db.put(student.getRegNo(),student);
        return "Student is added successfully";
    }

    public Student getStudentPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public String deleteStudentpath(int regNo) {
        db.remove(regNo);
        return "Student is deleted successfully";
    }

    public String deleteStudent(int regNo) {
        db.remove(regNo);
        return "Student is deleted successfully";
    }

    public Student updateCourse(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student updateCoursepath(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student changeCourseAge(int regNo, Student student) {
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
        return db.get(regNo);
    }
}
