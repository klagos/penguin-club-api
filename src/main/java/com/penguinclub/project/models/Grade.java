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
    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public Grade(Integer id, String title, Date date, Integer grade, Float weighing, Course course, Student student) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.grade = grade;
        this.weighing = weighing;
        this.course = course;
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
