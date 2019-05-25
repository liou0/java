package com.neuedu.a;

public class Zuoye09 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i < 200){
            if(i % 3 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("200以内3的倍数之和是：" + sum);
    }
    }
