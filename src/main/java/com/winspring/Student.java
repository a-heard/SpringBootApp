package com.winspring;

import java.sql.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int studentPin;
    private String studentClass;
    private Date birthday;
    private String gender;
    private String additional;
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentPin() {
        return studentPin;
    }

    public void setStudentPin(int studentPin) {
        this.studentPin = studentPin;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "User [ first name=" + firstName + ", last name=" +lastName + ", email=" + email + ", student pin # =" + studentPin + ", student class=" + studentClass + ", birthday=" + birthday + ",  gender=" + gender + ",Additional info=" + "]";
    }
    
}