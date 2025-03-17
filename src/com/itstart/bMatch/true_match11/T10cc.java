package com.itstart.bMatch.true_match11;

import java.util.Scanner;

public class T10cc {
    public static void main(String[] args) {
        orderTv();
    }

    public static void orderTv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入表示节目的数量和选择的数量");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("请输入每个节目好看值");
        int[] likes = new int[n];
        for (int i = 0; i < n; i++) {
            likes[i] = sc.nextInt();
        }
        sc.close();

        int[] selected = new int[m];
        int start = 0;
        for (int i = 0; i < m; i++) {
            int maxIndex = start;
            // 找出当前剩余可选节目中最好看的节目索引
            for (int j = start; j < n - (m - i); j++) {
                if (likes[j] > likes[maxIndex]) {
                    maxIndex = j;
                }
            }
            selected[i] = likes[maxIndex];
            // 更新搜索起始位置，保证节目顺序
            start = maxIndex + 1;
        }

        for (int i = 0; i < m; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(selected[i]);
        }
    }
}