package com.student.java;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {


        Optional<Students> students = Students.getAllStudents()
                .stream().max(Comparator.comparing(Students::getMarks));

        System.out.println(students);
        Optional<Students> students2 = Students.getAllStudents()
                .stream().min(Comparator.comparing(Students::getMarks));

        System.out.println(students2);
    }
}