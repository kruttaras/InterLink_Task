package com.okrutiak.institution.interlink;

import com.okrutiak.person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

  private String name;
  private List<Student> internship = new ArrayList<Student>();

  public Internship(String name, List<Student> students) {
    this.name = name;
    this.internship.addAll(students);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getInternship() {
    return internship;
  }

  public void setInternship(List<Student> internship) {
    this.internship = internship;
  }

  @Override
  public String toString() {
    return "Internship{" +
        "name='" + name + '\'' +
        ", interns=" + internship.toString() +
        '}';
  }
}
