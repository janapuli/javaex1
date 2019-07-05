package com.student.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {

        List<Students>students3=Students.getAllStudents()
                .stream().map(s-> new Students("ENG:"+s.getName(),s.getMarks())).collect(Collectors.toList());
         for (Students S:students3) {
             System.out.println(S.getName());
         }
       long count =Students.getAllStudents().stream().map(s-> new Students("ENG:"+s.getName(),s.getMarks())).count();
        System.out.println(count);


Students.getAllStudents().stream()
        .forEach(System.out::println);

         Students.getAllStudents().stream()
             .forEach(s->s.getName().toUpperCase());
        System.out.println();
    }}

