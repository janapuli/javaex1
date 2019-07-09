package com.compar;

import com.student.java.Students;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Rank {
    public static void main(String[] args) {

sort();
withlamda();
    }
        public static void sort(){

            List<Students> students = Students.getAllStudents();
            System.out.println(students);
            Collections.sort(students, new StudentRanker());
            System.out.println(students);



        }
        public static void withlamda(){
            List<Students> students = Students.getAllStudents();

            Comparator<Students>studentsComparator=(s1,s2)
                    ->(s1.getMarks()<s2.getMarks())?-1:(s1.getMarks()>s2.getMarks())?1:0;
            Collections.sort(students,studentsComparator);
            System.out.println("With Lamda");
            System.out.println(students);

                 {
                
            }


        }

}
