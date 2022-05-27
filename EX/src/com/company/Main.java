package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int m1[] = new int[17];

        for (int i = 0; i < 17; i++) {
            m1[i] = (int) Math.round(Math.random() * 5);
            System.out.println(m1[i]);

            if (m1[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print("Кількість парних чисел: "+a);

    }
}

