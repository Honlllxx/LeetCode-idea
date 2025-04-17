package com.itstart.bMatch.true_match16;

public class T1 {
    public static void main(String[] args) {

        /*public class lan2025 {
    public static void main(String[] args) {
        int count = 0;
        for (long i = 1; i <= 2025; i++) {
            if (i * i * i % 10 == 3) {
                count++;
            }
        }
        System.out.println(count); // 答案是 202
    }
}
*/
        int count = 0;
        // 遍历 0 到 9 这 10 个个位数
        for (int i = 0; i < 10; i++) {
            if ((i * i * i) % 10 == 3) {
                // 计算 1 到 2025 中该个位数出现的次数
                count += 2025 / 10;
                if (2025 % 10 >= i) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}