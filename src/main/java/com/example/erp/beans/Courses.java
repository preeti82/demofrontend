package com.example.erp.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String code;
    private String name;
    @Column(nullable = false, unique = true)
    private Integer course_id;
    private Integer term;
    private Integer year;
    private Integer credits;
    private Integer faculty_id;
    private String description;

    public Courses(String code, String name, Integer course_id, Integer term, Integer year, Integer credits, Integer faculty_id, String description) {
        this.code = code;
        this.name = name;
        this.course_id = course_id;
        this.term = term;
        this.year = year;
        this.credits = credits;
        this.faculty_id = faculty_id;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


