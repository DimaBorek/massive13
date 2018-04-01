package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array= new int[10];
        for (int i = 2, j = 0; i <21 ;i = i+2, j++) {
            array[j] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
