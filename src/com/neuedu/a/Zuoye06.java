package com.neuedu.a;
import java.util.Scanner;
public class Zuoye06 {
    public static void main(String[] args) {
        System.out.println("请输入一个五位正整数:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<10000 && number>=100000){
            System.out.println("输入的不是五位正整数!");
            return;
        }
        int a=number/10000;
        int b=number/1000%10;
        int c=number/100%10;
        int d=number/10%10;
        int e=number%10;
        if(a==e && b==d){
            System.out.println(number+"是回文数");
        }else{
            System.out.println(number+"不是回文数");
        }
    }
}
