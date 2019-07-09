package com.math;

import java.util.Map;

public class MathImpl {
    public static void main(String[] args) {
        Math math = x-> x*x;
        System.out.println(math.sqrd(10));
        System.out.println(math.sqrd(55));
        System.out.println(math.sqrd(9));
        System.out.println(math.sqrd(5));
        System.out.println(math.sqrd(20));

    }
}
