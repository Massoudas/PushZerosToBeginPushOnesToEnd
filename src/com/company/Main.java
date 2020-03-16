package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void pushZeroesAndOnes(int[] array) {
        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(Arrays.toString(array));
        int i=0;

        for ( i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                arrayList.add(0, array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 0) {
                arrayList.add(array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                arrayList.add(array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            array[i]=arrayList.get(i);
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroesAndOnes(arr);
        System.out.println(Arrays.toString(arr));
	// write your code here
    }
}
