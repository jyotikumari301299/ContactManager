package com.jyoticodes.springboot.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String name;
    private String address;
    private String course;
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCourse() {
        return course;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public Student(int rollNo, String name, String address, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.course = course;
    }

    

}
