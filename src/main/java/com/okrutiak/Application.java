package com.okrutiak;

import com.okrutiak.institution.interlink.Internship;
import com.okrutiak.person.Student;
import com.okrutiak.service.InternshipService;
import com.okrutiak.service.UniversityService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        UniversityService service = new UniversityService();
        List<Student> students = new ArrayList<>();
        students.addAll(service.getStudentsByUniversityName("NULP"));
        students.addAll(service.getStudentsByUniversityName("LNU"));
        students.addAll(service.getStudentsByUniversityName("Lisoteh"));

        InternshipService internshipService = new InternshipService();
        Internship interlinkInternship = internshipService.createInternshipForStudentsWithAverageLvl("Interlink", students);
        System.out.println(interlinkInternship);

    }
}
