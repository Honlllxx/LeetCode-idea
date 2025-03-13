package com.itstart.pt.the100a03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T2 {
    public static void main(String[] args) {
        int []numArr={123,4,5,6,4,5,99,8,7,10};
        System.out.println(longestConsecutive(numArr));

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set =new HashSet<>();
        int maxL=0;
        for (int num : nums) {
            set.add(num);
        }
        for (Integer i : set) {
            if(!set.contains(i-1)){
                int count =1;
                while (set.contains(i+count)){
                    count++;
                }
                maxL=Math.max(maxL,count);
            }
        }



        return maxL;
    }
}
