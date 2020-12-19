package com.example.erp.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = true)
    private String email;
    private Integer total_credit;
    private Integer cgpa;
    private String rollno;

    public Student(String first_name, String last_name, String email, Integer total_credit, Integer cgpa, String rollno) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.total_credit = total_credit;
        this.cgpa = cgpa;
        this.rollno = rollno;
    }

    public Student() {
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTotal_credit() {
        return total_credit;
    }

    public void setTotal_credit(Integer total_credit) {
        this.total_credit = total_credit;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
