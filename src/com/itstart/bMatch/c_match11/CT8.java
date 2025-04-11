package com.itstart.bMatch.c_match11;

import java.util.Scanner;

public class CT8 {
    public static void main(String[] args) {
        // 创建 Scanner 对象用于读取用户输入
        Scanner scanner = new Scanner(System.in);
        // 读取输入的序列长度 m
        int m = scanner.nextInt();
        // 读取输入的每个数的取值范围上限 n
        int n = scanner.nextInt();
        // 定义取模的常量，用于处理结果可能过大的情况
        int MOD = 10000;
        // 创建一个三维数组 dp 用于动态规划
        // dp[length][num][0] 表示长度为 length 且最后一个数为 num 的摆动序列，当前为偶数项的数量
        // dp[length][num][1] 表示长度为 length 且最后一个数为 num 的摆动序列，当前为奇数项的数量
        int[][][] dp = new int[m + 1][n + 1][2];

        // 初始化长度为 1 的摆动序列的数量
        // 因为长度为 1 的序列可以看作是摆动序列，所以对于每个可能的数字，其数量都初始化为 1
        for (int i = 1; i <= n; i++) {
            dp[1][i][0] = 1;
            dp[1][i][1] = 1;
        }

        // 从长度为 2 开始逐步计算不同长度的摆动序列数量
        for (int length = 2; length <= m; length++) {
            // 遍历每个可能的数字
            for (int num = 1; num <= n; num++) {
                // 如果当前长度为偶数项
                if (length % 2 == 0) {
                    // 偶数项要求比前一项小，所以遍历比当前数字小的所有可能的前一个数字
                    for (int prevNum = 1; prevNum < num; prevNum++) {
                        // 累加前一个长度为 length - 1 且最后一个数为 prevNum 的奇数项摆动序列的数量
                        // 并对结果取模，避免结果过大
                        dp[length][num][0] = (dp[length][num][0] + dp[length - 1][prevNum][1]) % MOD;
                    }
                } else {
                    // 如果当前长度为奇数项
                    // 奇数项要求比前一项大，所以遍历比当前数字大的所有可能的前一个数字
                    for (int prevNum = num + 1; prevNum <= n; prevNum++) {
                        // 累加前一个长度为 length - 1 且最后一个数为 prevNum 的偶数项摆动序列的数量
                        // 并对结果取模，避免结果过大
                        dp[length][num][1] = (dp[length][num][1] + dp[length - 1][prevNum][0]) % MOD;
                    }
                }
            }
        }

        // 初始化最终结果为 0
        int ans = 0;
        // 遍历所有可能的最后一个数字
        for (int i = 1; i <= n; i++) {
            // 累加长度为 m 且最后一个数为 i 的偶数项和奇数项摆动序列的数量
            // 并对结果取模，避免结果过大
            ans = (ans + dp[m][i][0] + dp[m][i][1]) % MOD;
        }

        // 输出最终结果
        System.out.println(ans);
    }
}    