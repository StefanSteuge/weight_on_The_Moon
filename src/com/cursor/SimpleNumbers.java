package com.cursor;


public class SimpleNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isSimple;
        for (i = 2; i < 100; i++) {
            isSimple = true;

            for (j = 2; j <=i/j; j++)
                System.out.println(i + ":" + j);
                if (i % j == 0)
                    isSimple = false;
            if (isSimple)
                            System.out.println(i + " Просте число");
        }
    }
}

//  Напишите программу, которая находила бы все простые числа в диапазоне от 2 до 100.
