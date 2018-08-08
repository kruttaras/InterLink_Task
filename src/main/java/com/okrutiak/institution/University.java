package com.okrutiak.institution;

import com.okrutiak.person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

  private String name;
  private List<Student> students = new ArrayList<>();

  public University(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public University(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }


  public void addStudent(Student student) {
    students.add(student);
  }
}
