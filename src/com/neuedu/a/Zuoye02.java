package com.neuedu.a;

public class Zuoye02 {
    public static void main(String[] args) {
        int i=99;
        if(i>100||i<0){
            System.out.println("你输入的成绩无效，请重新输入");
        }else{
            if(i>90){
                System.out.println("你的成绩等级是：A");
            }else if(i<90&&i>59){
                System.out.println("你的成绩等级是：B");
            }else{
                System.out.println("你的成绩等级是：C");
            }
    }
    }
}
