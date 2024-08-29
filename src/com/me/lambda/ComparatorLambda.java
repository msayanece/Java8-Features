package com.me.lambda;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        /**
         * Prior to Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Prior to Java 8 - 1 & 2 compare result -> " + comparator.compare(1,2));

        /**
         * After Java 8
         */

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {return a.compareTo(b);};
        System.out.println("After to Java 8 (1)- 1 & 2 compare result -> " + comparatorLambda.compare(1,2));

        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("After to Java 8 (2)- 1 & 2 compare result -> " + comparatorLambda2.compare(1,2));

        System.out.println("After to Java 8 (3)- 1 & 2 compare result -> " +
                ((Comparator<Integer>)(a, b) -> a.compareTo(b)).compare(1,2));

        System.out.println("After to Java 8 (4)- 1 & 2 compare result -> " +
                ((Comparator<Integer>)(a, b) -> {if(a>0)return a.compareTo(b); else return 99;}).compare(-1,2));

    }
}
