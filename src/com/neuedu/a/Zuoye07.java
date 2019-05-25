package com.neuedu.a;

import java.util.Scanner;

public class Zuoye07 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个年份: ");
        year = scanner.nextInt();

        if((year % 4== 0 && year% 100 != 0) || year % 400 == 0 ){
            System.out.println(year+"年是闰年 " );
        }
        else{
            System.out.println(year+"年是平年 " );
        }
    }
}
