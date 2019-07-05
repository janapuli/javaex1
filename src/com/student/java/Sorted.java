package com.student.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {

        List<Students> students = Students.getAllStudents()
                .stream().sorted(Comparator.comparing(Students::getName)).collect(Collectors.toList());
        System.out.println(students);

        List<Students> students1 = Students.getAllStudents()
                .stream().sorted((s1,s2)->new Integer(s1.getName().length())).collect(Collectors.toList());
        System.out.println(students1);
    }
}
