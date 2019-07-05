package com.student.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
       withoutStresm();
        stream();
        streamnew();
    }
public static void withoutStresm() {
            List<Students> students = Students.getAllStudents();
            List<Students> newstudents = new ArrayList<>();

            for (Students student : students) {
                if (student.getMarks() > 50) {

                    newstudents.add(student);
                }


            }
            System.out.println(students.size());
            System.out.println(newstudents.size());
        }


    public static void stream(){

        List<Students>students=Students.getAllStudents().stream().filter(s ->s.getMarks()>50).collect(Collectors.toList());
        System.out.println(students.size());



    }
    public static void streamnew(){
        List<Students>students=Students.getAllStudents().stream().filter(s ->s.getName().contains("i")).collect(Collectors.toList());
        System.out.println(students.size());
        for (Students s:students)
        System.out.println(s.getName());

        }
    }


