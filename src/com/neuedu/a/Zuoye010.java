package com.neuedu.a;

import java.util.Scanner;

public class Zuoye010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = false;
        int i=0;
        while(a%10>0){
            i += a%10;
            a = a/10;
        }
        i = i + a;
        if(i%9==0){
            flag = true;
        }
        System.out.println(flag?"能整除":"不能整除");
    }
}
