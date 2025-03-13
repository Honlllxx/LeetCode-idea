package com.itstart.bMatch.true_match11;

import java.util.Scanner;

public class T7COPY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入的单词
        String word = scanner.nextLine();
        // 调用判断方法
        boolean result = isDesiredWord(word);
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }

    public static boolean isDesiredWord(String word) {
        int index = 0;
        int len = word.length();

        // 第一段：一个或多个辅音字母
        boolean hasConsonant1 = false;
        while (index < len && !isVowel(word.charAt(index))) {
            hasConsonant1 = true;
            index++;
        }
        if (!hasConsonant1) {
            return false;
        }

        // 第二段：一个或多个元音字母
        boolean hasVowel1 = false;
        while (index < len && isVowel(word.charAt(index))) {
            hasVowel1 = true;
            index++;
        }
        if (!hasVowel1) {
            return false;
        }

        // 第三段：一个或多个辅音字母
        boolean hasConsonant2 = false;
        while (index < len && !isVowel(word.charAt(index))) {
            hasConsonant2 = true;
            index++;
        }
        if (!hasConsonant2) {
            return false;
        }

        // 第四段：一个或多个元音字母
        boolean hasVowel2 = false;
        while (index < len && isVowel(word.charAt(index))) {
            hasVowel2 = true;
            index++;
        }
        if (!hasVowel2 || index != len) {
            return false;
        }

        return true;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
