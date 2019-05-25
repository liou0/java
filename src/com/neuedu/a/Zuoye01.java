package com.neuedu.a;

public class Zuoye01 {
    public static void main(String[] args) {
        int i = 100;
        int a, b, c;
        for (i = 100; i < 1000; i++) {
            a = i / 1 % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;

            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println("水仙花数为"+i);
            }
        }
    }
}
