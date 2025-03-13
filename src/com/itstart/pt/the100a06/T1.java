package com.itstart.pt.the100a06;

import javax.imageio.event.IIOReadProgressListener;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        int[]nums={ -3,-1,-1, 0, 1, 2,5};
        int []numsa={-3,-1,-2,-2,-2,0,0,0,1,1,2};
        System.out.println(threeSum(nums));
        System.out.println(threeSum(numsa));

    }
    public static List<List<Integer>> threeSum(int []nums){
      List<List<Integer>> list =new ArrayList<>();

      Arrays.sort(nums);
      if (nums==null||nums.length<3) return list;

        for (int i = 0; i < nums.length; i++) {
            int target=-nums[i];
            if (nums[i]>0) break;
            int l=i+1, r=nums.length-1;
           if (i>0&&nums[i]==nums[i-1])continue;
            while (l<r){
                int sum=nums[l]+nums[r];
                if (sum<target){
                    l++;
                }else if (sum>target){
                    r--;
                }else {
                    list.add(Arrays.asList(nums[i],nums[r],nums[l]));
                   while (l<r&&nums[l]==nums[l+1]) l++;
                    while (l<r&&nums[r]==nums[r-1]) r--;
                    l++;r--;
                }
            }
        }
        return list;

    }

}
