package com.neuedu.b;

public class ZY052701 {
    public static void main(String[] args) {
        Test1 oRec1 = new Test1();
        System.out.println("默认长方形的周长为："+oRec1.getLength());
        System.out.println("默认长方形的面积为："+oRec1.getSquare());

        Test1 oRec2 = new Test1(2);
        System.out.println("一个参数长方形的周长为："+oRec2.getLength());
        System.out.println("一个参数长方形的面积为："+oRec2.getSquare());

        Test1 oRec3 = new Test1(2,3);
        System.out.println("两个参数长方形的周长为："+oRec3.getLength());
        System.out.println("两个参数长方形的面积为："+oRec3.getSquare());
    }

}
