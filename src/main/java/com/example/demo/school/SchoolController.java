package com.example.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/Schools")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @RequestMapping("/Schools/{id}")
    public School getSchoolById(@PathVariable Long id) {
        return schoolService.getSchoolById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/schools")
    public void addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/schools/{id}")
    public void updateSchool(@RequestBody School school, @PathVariable Long id) {
        schoolService.updateSchool(school, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/schools/{id}")
    public void deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchoolById(id);
    }
}
