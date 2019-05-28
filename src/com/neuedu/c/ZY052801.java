package com.neuedu.c;

import java.io.*;

public class ZY052801 {
    String[] number = new String[5];
    String[] name = new String[5];
    float[][] grade = new float[5][3];
    float[] sum = new float[5];

    public static void main(String[] args) throws Exception {
        ZY052801 stud = new ZY052801();
        stud.input();
    }

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isRecord = true;
        while (isRecord) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print("请输入学号：");
                    number[i] = br.readLine();
                    System.out.print("请输入姓名：");
                    name[i] = br.readLine();
                    for (int j = 0; j < 3; j++) {
                        System.out.print("请输入第" + (j + 1) + "门课成绩：");
                        grade[i][j] = Integer.parseInt(br.readLine());
                    }
                    System.out.println();
                    sum[i] = grade[i][0] + grade[i][1] + grade[i][2];
                }
                isRecord = false;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个数字！");
            }
        }
    }
}

