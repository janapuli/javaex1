package com.compar;

import com.student.java.Students;

import java.util.Comparator;

public class StudentRanker implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        if(s1.getMarks()<s2.getMarks()){
            return -1;
        }
        else if(s1.getMarks()>s2.getMarks()) {
            return 1;

        }else{

            return 0;
        }


    }


}
