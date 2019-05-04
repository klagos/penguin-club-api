package com.penguinclub.project.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Grade {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Date date;
    private Integer grade;
    private Float weighing;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public Grade(){
    }

    public Grade(Integer id, String title, Date date, Integer grade, Float weighing, Subject subject, Student student) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.grade = grade;
        this.weighing = weighing;
        this.subject = subject;
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Grade(Integer id, String title, Date date, Integer grade, Float weighing) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.grade = grade;
        this.weighing = weighing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Float getWeighing() {
        return weighing;
    }

    public void setWeighing(Float weighing) {
        this.weighing = weighing;
    }
}
