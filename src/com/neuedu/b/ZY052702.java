package com.neuedu.b;

import java.util.Scanner;

public class ZY052702 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r = sc.nextDouble();
        if (r < 0)
            System.out.println("你输入的半径有误!");
        else{
Test2 R = new Test2(r);
System.out.println("--------------------------------");
System.out.println("圆的周长为：" + String.format("%.2f", R.Collect()));
System.out.println("圆的面积为：" + String.format("%.2f", R.Area()));
}

    }
}
