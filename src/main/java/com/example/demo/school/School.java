package com.example.demo.school;

import com.example.demo.student.Student;

import javax.persistence.*;

@Table(name = "school")
@Entity(name = "school")
public class School {

    @Id
    @SequenceGenerator(name = "school_seq", sequenceName = "school_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_seq")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String Address;

    @ManyToOne
    private Student student;

    public School(Long id, String name, String address, Student student) {
        this.id = id;
        this.name = name;
        Address = address;
        this.student = student;
    }

    public School() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
