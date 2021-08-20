package com.example.patikadevodev2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@PrimaryKeyJoinColumn(name="user_id")
@Entity
@Table(name="students")
public class Student extends User {

    @Column(name="birth_date")
    private LocalDate birthDate;

    @Column(name="gender")
    private String Gender;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Course> studentCourses = new HashSet<>();



    public Student(String name, String address, LocalDate birthDate, String gender) {
        super(name, address);
        this.birthDate = birthDate;
        this.Gender = gender;
    }

    public Student() {

    }

    public Set<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(birthDate, student.birthDate) && Objects.equals(Gender, student.Gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate, Gender);
    }
}
