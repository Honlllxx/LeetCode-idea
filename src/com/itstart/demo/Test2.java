package com.itstart.demo;

import java.util.Scanner;

public class Test2 {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入的正整数 n
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        // 遍历从 1 到 n 的所有整数
        for (int i = 1; i <= n; i++) {
            if (isIncreasingDigits(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        // 输出数位递增的数的数量
        System.out.println(count);
    }

    // 判断一个整数是否为数位递增的数
    public static boolean isIncreasingDigits(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length() - 1; i++) {
            // 如果当前数位大于右边相邻的数位，则不是数位递增的数
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }*/
  public static int getSuInc(int n) {
      int count = 0;
      for (int i = 1; i <= n; i++) {
          if (isIncreasingDigits(i)) {
              count++;
          }
      }
      return count;
  }

    private static boolean isIncreasingDigits(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("从 1 到 " + n + " 中数位递增的数的个数为: " + getSuInc(n));
    }
}

