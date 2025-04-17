package com.itstart.bMatch.true_match16;

import java.util.Scanner;

public class TE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //存储用户输入数据
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 不翻转时的最大分数
        long maxScoreWithoutReverse = getMaxScore(arr);

        // 尝试所有可能的翻转区间，计算翻转后的最大分数
        long maxScoreWithReverse = maxScoreWithoutReverse;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                int[] newArr = reverse(arr, l, r);
                long score = getMaxScore(newArr);
                maxScoreWithReverse = Math.max(maxScoreWithReverse, score);
            }
        }

        System.out.println(maxScoreWithReverse);
        scanner.close();
    }

    // 翻转数组中指定区间 [l, r]
    private static int[] reverse(int[] arr, int l, int r) {
        int[] newArr = arr.clone();
        while (l < r) {
            int temp = newArr[l];
            newArr[l] = newArr[r];
            newArr[r] = temp;
            l++;
            r--;
        }
        return newArr;
    }

    // 计算给定数组不翻转时的最大分数
    private static long getMaxScore(int[] arr) {
        long maxScore = 0;
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            //有相同元素指针走
            while (end < arr.length - 1 && arr[end] == arr[end + 1]) {
                end++;
            }
            //计算得分
            long score = (end - start + 1L) * arr[start];
            //比较最大值
            maxScore = Math.max(maxScore, score);
            //end指针走
            end++;
            //初始指针跳转位置到end
            start = end;
        }
        //返回最大值
        return maxScore;
    }
}