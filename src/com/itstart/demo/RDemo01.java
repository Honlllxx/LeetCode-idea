package com.itstart.demo;

import java.util.HashMap;
import java.util.Map;

public class RDemo01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                //返回索引
                //如果map中有相减的值
                //返回该值索引,并返回值sum[i]的索引
                return new int[] {map.get(complement), i};
            }
            //i记录的是每一个数的索引
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        RDemo01 solution = new RDemo01();
        int[] sums = {6,3,2,7};
        int target = 9;
        int[] result = solution.twoSum(sums, target);
        System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
    }
}