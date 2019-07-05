package com.student.java;

import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    int marks;

    public Students(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }

    public String getName() {

        return name;
    }

    public int getMarks() {
        return marks;

    }
    public void setName(String name){
        this.name=name;


    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static List<Students> getAllStudents() {
        List<Students> list = new ArrayList<>();

        list.add(new Students("janani", 60));
        list.add(new Students("kamani", 75));
        list.add(new Students("saman", 65));
        list.add(new Students("sachee", 85));
        list.add(new Students("nisha", 90));
        list.add(new Students("kalpani", 82));
        list.add(new Students("gayani", 96));
        list.add(new Students("manori", 40));
        list.add(new Students("pulitha", 63));
        list.add(new Students("kasun", 45));
return list;
    }
}

