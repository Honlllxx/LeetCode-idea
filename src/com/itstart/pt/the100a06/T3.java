package com.itstart.pt.the100a06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3 {
    public static void main(String[] args) {
        int[]nums={ -3,-1, 0, 1, 2,5};
        System.out.println(threeSum(nums));
    }
        public static  List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            int n = nums.length;

            if (nums == null || n < 3)
                return ans;

            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {

                if(nums[i] > 0) break;
                if(i > 0 && nums[i] == nums[i-1]) continue;

                int target = -nums[i];

                int j = i+1;
                int k = nums.length - 1;

                while (j < k) {
                    int sum = nums[j] + nums[k];

                    if (sum > target)
                        k--;
                    else if (sum < target)
                        j++;
                    else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j<k&& nums[j]==nums[j+1]) j++;
                        while(j<k&& nums[k]==nums[k-1]) k--;
                        j++;k--;
                    }

                }
            }

            return ans;
        }
    }



