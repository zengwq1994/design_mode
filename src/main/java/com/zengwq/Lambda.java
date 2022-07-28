package com.zengwq;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i--);
        System.out.println(i);
        i = 10;
        System.out.println(--i);
        List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
        primes.stream().distinct();
        int factor = 2;
        primes.forEach(element -> System.out.println(factor*element));

        primes.forEach(s -> System.out.println("*" + s + "*"));
    }
}
