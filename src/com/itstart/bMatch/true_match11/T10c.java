package com.itstart.bMatch.true_match11;

import java.util.Scanner;
import java.util.Arrays;

public class T10c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入表示节目的数量和选择的数量");
        int n = sc.nextInt();
        int m = sc.nextInt();
//13
        System.out.println("请输入每个节目好看值");
        Integer[] likes = new Integer[n]; // 使用包装类 Integer
        for (int i = 0; i < n; i++) {
            likes[i] = sc.nextInt();
        }
        sc.close();

        // 按好看值降序排序
        Arrays.sort(likes, (a, b) -> b - a);

        // 输出前 m 个值
        for (int i = 0; i < m; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(likes[i]);
        }
    }
}