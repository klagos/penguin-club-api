package com.penguinclub.project.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Assistance {
    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    private Boolean state;
    private String period;


    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;

    public Assistance(){
    }

    public Assistance(Integer id, Date date, Boolean state, String period) {
        this.id = id;
        this.date = date;
        this.state = state;
        this.period = period;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

}
