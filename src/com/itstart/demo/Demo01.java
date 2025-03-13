package com.itstart.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public List<int[]> twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        if (nums == null || nums.length < 2) {
            return result;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Demo01 solution = new Demo01();
        int[] sums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        List<int[]> result = solution.twoSum(sums, target);

        for (int[] indices : result) {
            System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
        }
    }
}