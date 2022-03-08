package com.example.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    public School getSchoolById (Long id) {
        return schoolRepo.findById(id).orElse(null);
    }

    public List<School> getAllSchools () {
        return schoolRepo.findAll();
    }

    public void addSchool(School school) {
        schoolRepo.save(school);
    }

    public void updateSchool(School school, Long id) {
        try {
            schoolRepo.save(school);
        } catch (NullPointerException e) {
            return;
        }
    }

    public void deleteSchoolById(Long id) {
        schoolRepo.deleteById(id);
    }

}
