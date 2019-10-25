package com.okrutiak.service;

import com.okrutiak.institution.interlink.Internship;
import com.okrutiak.person.Student;

import java.util.List;
import java.util.stream.Collectors;

public class InternshipService {
    public Internship createInternshipForStudentsWithAverageLvl(String name, List<Student> students) {
        double average = students.stream()
            .map(Student::getKnowledge)
            .mapToInt(i -> i)
            .average().orElse(0);
        List<Student> enrolledStudents = students.stream()
                .filter(student -> student.getKnowledge() > average).collect(Collectors.toList());
        return new Internship(name, enrolledStudents);
    }
}
