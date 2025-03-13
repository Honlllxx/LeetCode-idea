package com.itstart.demo;

import java.util.*;
//128. 最长连续序列
//开始判断条件要明确:开有没有连续的数
//
public class Demo03 {
    public static void main(String[] args) {
      int []  nums = {100,4,200,1,3,2,201,202,203,204};
        Demo03 demo03 = new Demo03();
        System.out.println(demo03.longestConsecutive(nums));
    }
    public int longestConsecutive(int[] nums) {
        //Set单列集合
        //无序不重复无索引
        Set<Integer> num_set = new HashSet<Integer>();
        //遍历数组
        for (int num : nums) {
            //把元素添加到num_set集合中
            num_set.add(num);
        }
//计数器
        //最长值
        int longestStreak = 0;
//遍历集合  集合方法多效率比数组快
        for (int num : num_set) {
            //如果当前数前面没有连续数
            if (!num_set.contains(num - 1)) {
                //tmp值
                int currentNum = num;
                //初始值
                int currentStreak = 1;
               //循环
                //有下一个数计数值加加
                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                //
                longestStreak = Math.max(longestStreak, currentStreak);
            }

        }

        return longestStreak;
    }

}
