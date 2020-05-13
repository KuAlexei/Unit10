package com.epam.ld.javabasics30.unit10.skils.formation.task01;

import java.util.Date;
import java.util.Objects;

public class Student {

    private String id;
    private String surname;
    private String name;
    private String fathersName;
    private Date birthday;
    private String address;
    private String phone;
    private String faculty;
    private String course;

    public Student(String surname, String name, String fathersName) {
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(name, student.name) &&
                Objects.equals(fathersName, student.fathersName) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, fathersName, birthday, address, phone, faculty, course);
    }
}
