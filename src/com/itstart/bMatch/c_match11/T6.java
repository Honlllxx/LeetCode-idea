package com.itstart.bMatch.c_match11;

import java.util.Arrays;
import java.util.Scanner;

public class T6 {
    /*【问题描述】
给定一个单词，请使用凯撒密码将这个单词加密。
凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
例如，lanqiao会变成odqtldr。
【输入格式】
输入一行，包含一个单词，单词中只包含小写英文字母。
【输出格式】
输出一行，表示加密后的密文。
【样例输入】
lanqiao
【样例输出】
odqtldr*/



    public static void main(String[] args) {
        System.out.println("word:");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine()   ;
        char []ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int range=ch[i]+3;
            if (range<'z'){
                ch[i]=(char)range;
            }else if (range>'z'){
                int temp=range-26;
                ch[i]=(char) temp;
            }
        }

        String str =new String(ch);
        System.out.println(str);
    }


}
