package com.neuedu.a;

public class Test1 {
    public static void main(String[] args) {
        int i = 4534534;
        int m = 0;
        while (i != 0) {
            m = i % 10;
            System.out.print(m);
            i = i / 10;
        }
    }
}
