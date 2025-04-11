package com.itstart.bMatch.c_match11;

import java.util.Scanner;

public class T5 {
    /*【问题描述】
给定三个整数 a, b, c，如果一个整数既不是 a 的整数倍也不是 b 的整数倍还不是 c 的整数倍，则这个数称为反倍数。
请问在 1 至 n 中有多少个反倍数。
【输入格式】
输入的第一行包含一个整数 n。
第二行包含三个整数 a, b, c，相邻两个数之间用一个空格分隔。
【输出格式】
输出一行包含一个整数，表示答案。
【样例输入】
30
2 3 6
【样例输出】
10*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // 读取第一行输入的 n
            int n = scanner.nextInt();
            // 读取第二行输入的 a、b、c
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // 初始化计数器
            int count = 0;
            // 遍历 1 到 n 的所有整数
            for (int i = 1; i <= n; i++) {
                // 判断是否为反倍数
                if (i % a != 0 && i % b != 0 && i % c != 0) {
                    System.out.print(i+" ");

                    count++;
                }
            }
            // 输出结果
            System.out.println(count);
            scanner.close();
        }
    }
