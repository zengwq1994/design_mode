package com.zengwq.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(1);
        unsortedList.add(5);
        unsortedList.add(8);
        unsortedList.add(2);
        unsortedList.add(3);
        unsortedList.add(8);
        unsortedList.add(2);
        unsortedList.add(8);
        unsortedList.add(21);
        unsortedList.add(20);
        unsortedList.add(29);
        int size = unsortedList.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (unsortedList.get(i) > unsortedList.get(j)) {
                    int temp = unsortedList.get(i);
                    unsortedList.add(i, unsortedList.get(j));
                    unsortedList.add(j, temp);
                }
            }
        }
        //ObjectMapper mapper = new ObjectMapper();
        System.out.println();
    }
}
