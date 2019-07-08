package com.student.java;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HomeW {
    public static void main(String[] args) {
        map1();
        sortmap();

    }
    public static void map1() {

   Map< String,Integer> result=Students.getAllStudents().
           stream().collect(Collectors.toMap(Students::getName,Students::getMarks));
        System.out.println(result);

    }

    public static void sortmap(){
        Map<String,Integer> unsortMap  = Students.getAllStudents().stream().collect(Collectors.toMap(Students::getName,Students::getMarks));

        Map<String, Integer> result =unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        Map<String, Integer> result1 = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        System.out.println("Sorted by key");

        System.out.println(result);

        System.out.println("Sorted by value");

        System.out.println(result1);




    }
    }

