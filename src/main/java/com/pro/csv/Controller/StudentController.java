package com.pro.csv.Controller;

import com.pro.csv.Model.Student;
import com.pro.csv.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        if (!students.isEmpty()) {
            return ResponseEntity.ok(students);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
//    @GetMapping("/{mobileNumber}")
//    public ResponseEntity<Student> getStudentByMobileNumber(@PathVariable String mobileNumber) {
//        Student student = studentRepository.findByContact1(mobileNumber);
//        if (student != null) {
//            return ResponseEntity.ok(student);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
@GetMapping("/{mobileNumber}")
public ResponseEntity<Student> getStudentByMobileNumber(@PathVariable String mobileNumber) {
    Student student = studentRepository.findByContact1(mobileNumber);

    if (student == null) {
        student = studentRepository.findByContact2(mobileNumber);
    }

    if (student != null) {
        return ResponseEntity.ok(student);
    } else {
        return ResponseEntity.notFound().build();
    }
}

    @PostMapping("/register")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
}
