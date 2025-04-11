package com.itstart.bMatch.c_match11;

import java.util.Scanner;

public class Rt7 {
    /*【问题描述】
对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
例如，一个 4 行 5 列的螺旋矩阵如下：
1 2 3 4 5
14 15 16 17 6
13 20 19 18 7
12 11 10 9 8
【输入格式】
输入的第一行包含两个整数 n, m，分别表示螺旋矩阵的行数和列数。
第二行包含两个整数 r, c，表示要求的行号和列号。
【输出格式】
输出一个整数，表示螺旋矩阵中第 r 行第 c 列的元素的值。
【样例输入】
4 5
2 2
【样例输出】
15
【评测用例规模与约定】
对于 30% 的评测用例，2 <= n, m <= 20。
对于 70% 的评测用例，2 <= n, m <= 100。
对于所有评测用例，2 <= n, m <= 1000，1 <= r <= n，1 <= c <= m。
*/
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

        int[][] matrix = new int[n][m];

        int num=1;

        int top=0;
        int bottom=n-1;
        int right=m-1;
        int left=0;

        while (top<=bottom&&left<=right){

            for (int i=left;i<=right;i++){
                matrix[top][i]=num++;
            }
            top++;
            for (int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;

            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
            }
            bottom--;
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    matrix[i][left]=num++;
                }
                left++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(matrix[r-1][c-1]);

    }
}
