package com.example.erp.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Grades")
public class Grades{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String letter_grade;
    private Integer grade_point;
    @Column(nullable = false, unique = true)
    private Integer grade_id;
    private String comment;

    public Grades(String letter_grade, Integer grade_point, Integer grade_id, String comment) {
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
        this.grade_id = grade_id;
        this.comment = comment;
    }

    public String getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(String letter_grade) {
        this.letter_grade = letter_grade;
    }

    public Integer getGrade_point() {
        return grade_point;
    }

    public void setGrade_point(Integer grade_point) {
        this.grade_point = grade_point;
    }

    public Integer getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Integer grade_id) {
        this.grade_id = grade_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }