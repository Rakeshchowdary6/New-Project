package com.pro.csv.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "workbook")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use appropriate strategy for your database
    private Long id;
    private String medium;
    private String name;
    private String address;
    private String contact1;
    private String contact2;
    private int marks;

    public Student() {
    }

    public Student(long id, String medium, String name, String address, String contact1, String contact2, int marks) {
        this.id = id;
        this.medium = medium;
        this.name = name;
        this.address = address;
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getmedium() {
        return medium;
    }

    public void setmedium(String medium) {
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", medium='" + medium + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact1='" + contact1 + '\'' +
                ", contact2='" + contact2 + '\'' +
                ", marks=" + marks +
                '}';
    }

    // Constructors, getters, and setters
}
