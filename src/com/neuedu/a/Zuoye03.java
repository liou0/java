package com.neuedu.a;

public class Zuoye03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                for(int k=0;k<arr.length;k++) {
                    if(i!=j   &&  j!=k   &&  k!=i) {
                        System.out.println(i*100+j*10+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("一共有"+count+"个无重复数");
    }
}
