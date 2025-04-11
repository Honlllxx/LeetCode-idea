package com.itstart.bMatch.c_match11;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        // 创建 Scanner 对象用于从控制台读取输入
        Scanner scanner = new Scanner(System.in);
        // 读取螺旋矩阵的行数
        int n = scanner.nextInt();
        // 读取螺旋矩阵的列数
        int m = scanner.nextInt();
        // 读取要查询的元素所在的行号
        int r = scanner.nextInt();
        // 读取要查询的元素所在的列号
        int c = scanner.nextInt();

        // 创建一个 n 行 m 列的二维数组来存储螺旋矩阵
        int[][] matrix = new int[n][m];
        // 用于填充矩阵的数字，从 1 开始
        int num = 1;
        // 定义矩阵的左边界，初始为第 0 列
        int left = 0;
        // 定义矩阵的右边界，初始为最后一列
        int right = m - 1;
        // 定义矩阵的上边界，初始为第 0 行
        int top = 0;
        // 定义矩阵的下边界，初始为最后一行
        int bottom = n - 1;

        // 当左边界小于等于右边界且上边界小于等于下边界时，继续填充矩阵
        while (left <= right && top <= bottom) {

            //前两次top/right值变更已经被while循环判断过滤不需要判断
            // 从左到右填充矩阵的上边界行
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            // 上边界向下移动一行
            top++;

            // 从上到下填充矩阵的右边界列
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            // 右边界向左移动一列
            right--;
            //值变更后需要重新判断是否越界
            // 若上边界仍然小于等于下边界，说明还有行需要填充
            if (top <= bottom) {
                // 从右到左填充矩阵的下边界行
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                // 下边界向上移动一行
                bottom--;
            }

            // 若左边界仍然小于等于右边界，说明还有列需要填充
            if (left <= right) {
                // 从下到上填充矩阵的左边界列
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                // 左边界向右移动一列
                left++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                System.out.print(matrix[i][i1]+" ");
            }
            System.out.println();
        }

        // 输出螺旋矩阵中第 r 行第 c 列的元素值，注意数组下标从 0 开始，所以要减 1
        System.out.println(matrix[r - 1][c - 1]);

        // 关闭 Scanner 对象，释放资源
        scanner.close();
    }
}