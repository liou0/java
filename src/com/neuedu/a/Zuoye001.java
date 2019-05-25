package com.neuedu.a;

public class Zuoye001 {
    public static void main(String[] args) {
        int num = 100;
        int g, s, b;
        for (num = 100; num < 1000; num++) {
            g = num / 1 % 10;
            s = num / 10 % 10;
            b = num / 100 % 10;

            if (num == g * g * g + s * s * s + b * b * b) {
                System.out.println("水仙花数为"+num);
            }
        }
    }
}