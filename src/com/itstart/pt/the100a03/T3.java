package com.itstart.pt.the100a03;

public class T3 {
    //衍生思考
    /*判断一个整数n有多少个连续数字组
    * */
    public static int countConsecutiveDigitGroups(int n) {
        String numStr = String.valueOf(n);
        int length = numStr.length();
        if (length <= 1) {
            return length;
        }
        int count = 0;
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 1; i < length; i++) {
            int currentDigit = numStr.charAt(i) - '0';
            int previousDigit = numStr.charAt(i - 1) - '0';
            if (currentDigit == previousDigit + 1) {
                if (!isIncreasing) {
                    count++;
                    isIncreasing = true;
                    isDecreasing = false;
                }
            } else if (currentDigit == previousDigit - 1) {
                if (!isDecreasing) {
                    count++;
                    isDecreasing = true;
                    isIncreasing = false;
                }
            } else {
                isIncreasing = false;
                isDecreasing = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12321;
        int result = countConsecutiveDigitGroups(n);
        System.out.println("整数 " + n + " 有 " + result + " 个连续数字组。");
    }
}
