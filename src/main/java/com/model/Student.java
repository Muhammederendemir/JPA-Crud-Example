package com.model;

import org.hibernate.annotations.Entity;

@Entity
public class Student extends BaseEntity {
    private String email;

    public Student(String email) {
        this.email = email;
    }

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}