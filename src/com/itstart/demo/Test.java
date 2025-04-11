package com.itstart.demo;

import org.junit.Assert;
import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void  lengthOfLongestSubstring() {
        String s ="123456";
        char[]ch=s.toCharArray();
        for(char word : ch){
            System.out.println(word);
        }
    }

    @org.junit.Test
    public void method1(){
        System.out.println("hello!");
    }
}
