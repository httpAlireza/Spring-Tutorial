package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student getStudentById (Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student, Long id) {
        try {
            studentRepo.save(student);
        } catch (NullPointerException e) {
            return;
        }
    }

    public void deleteStudentById(Long id){
        studentRepo.deleteById(id);
    }
}
