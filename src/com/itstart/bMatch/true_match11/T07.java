package com.itstart.bMatch.true_match11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
        System.out.println(getFourWord());
    }
    public static String getFourWord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入单词");
        String word=sc.nextLine();

        int index=0;
        int len=word.length();
        boolean hasConsonat1=false;
        while (index<len&&!isVowel(word.charAt(index))){
            hasConsonat1=true;
            index++;
        }
        if (!hasConsonat1){
            return "no";
        }

        boolean hasVowel1=false;
        while (index<len&&isVowel(word.charAt(index))){
            hasVowel1=true;
            index++;
        }

        if (!hasVowel1){
            return "no";
        }
        boolean hasConsonat2=false;
        while (index<len&&!isVowel(word.charAt(index))){
            hasConsonat2=true;
            index++;
        }

        boolean hasVowel2=false;
        while (index<len&&isVowel(word.charAt(index))){
            hasVowel2=true;
            index++;
        }
        if (!hasVowel2){
            return "no";
        }
        return "yes";
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u';
    }
}
