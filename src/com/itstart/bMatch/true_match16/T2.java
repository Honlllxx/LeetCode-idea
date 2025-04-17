package com.itstart.bMatch.true_match16;

public class T2 {
    public static void main(String[] args) {
        int x = 20250412, y = 20240413;
        int c = x - y;
        for (int i = 1; i < 100000000; i++) {
            if (((x - c) * i - c) % x == 0) {
                long N = (long) (x - c) * i - x;
                System.out.println(N); // 答案
                break;
            }
        }
    }
}
