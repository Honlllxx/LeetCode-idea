package com.itstart.pt.the100a05;

import javax.naming.AuthenticationNotSupportedException;

public class T2 {
    public static void main(String[] args) {
        int []height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[]nums){
        int l=0,r=nums.length-1;
        int ans=0;
        while (l<r){
            if (nums[l]<=nums[r]){
                ans=Math.max(ans,nums[l]*(r-l));
                l++;

            }else {
                ans=Math.max(ans,nums[r]*(r-l));
                r--;
            }
        }
        return ans;
    }

}
