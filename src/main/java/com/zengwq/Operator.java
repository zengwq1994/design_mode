package com.zengwq;

public class Operator {

    public static void main(String[] args) {
        int i = 1, j = 2;
        System.out.println(~i);
        System.out.println(i & j);
        System.out.println(i | j);
        System.out.println(i ^ j);
        System.out.println(0 >> 15);
        System.out.println(0 >>> 15);
        System.out.println(i << j);
    }
}
