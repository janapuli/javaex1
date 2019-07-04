package com.janani.training.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("initial size" + list.size());
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");

        System.out.println("After adding size" + list.size());
        list.remove(3);

        System.out.println("After remove sizw"+list.size());
        for (String string :list) {
            System.out.println(string);
        }
    }
}