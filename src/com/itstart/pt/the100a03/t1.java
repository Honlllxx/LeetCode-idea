package com.itstart.pt.the100a03;

import java.lang.invoke.CallSite;
import java.util.*;
import java.util.concurrent.CountDownLatch;
public class t1 {
    public static void main(String[] args) {
        //最长连续序列
        int[] nums = {0, 3, 7, 2, 5, 8,13,12,23,4, 6, 0, 1};
        System.out.println("  "+longestConsecutive(nums));

    }
   public static int longestConsecutive(int[] nums) {
        /*1.x'x排序  利用hashSet的contains 方法
        * 2.去除重复项
        * 3.查找最长连续序列  */
        Set<Integer> set =new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
       for (Integer i : set) {
           System.out.print(i);
       }
//悟:寻找终止条件,连续条件不适合应用
        int maxL =0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                //此处可取num赋值给中间值,用中间值自增加;
                while (set.contains(num + count)) {
                    count++;
                }
                maxL = Math.max(count, maxL);
            }
        }
        return maxL;
    }
}