package com.example.StudentsManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo){
        return studentRepository.getStudent(regNo);
    }


    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public Student getStudentPath(int regNo) {
        return studentRepository.getStudentPath(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        return studentRepository.updateAge(regNo,newAge);
    }

    public String deleteStudentpath(int regNo) {
        return studentRepository.deleteStudentpath(regNo);
    }

    public String deleteStudent(int regNo) {
        return studentRepository.deleteStudent(regNo);
    }

    public Student updateCourse(int regNo, String newCourse) {
      return   studentRepository.updateCourse(regNo,newCourse);
    }

    public Student updateCoursepath(int regNo, String newCourse) {
        return studentRepository.updateCoursepath(regNo,newCourse);
    }

    public Student changeCourseAge(int regNo, Student student) {
        return studentRepository.changeCourseAge(regNo,student);
    }
}
