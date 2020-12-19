package com.example.erp.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = true)
    private Integer faculty_id;
    @Column(nullable = false, unique = true)
    private String email;
    private String department;

    public Courses(String first_name, String last_name, Integer faculty_id, String email, String department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.faculty_id = faculty_id;
        this.email = email;
        this.department = department;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
