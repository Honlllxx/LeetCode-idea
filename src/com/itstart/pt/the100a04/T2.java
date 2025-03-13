package com.itstart.pt.the100a04;

public class T2 {
    public static void main(String[] args) {
        int []nums ={0,2,3,5,70,0,0,0,5,0};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void moveZeroes(int []nums){
        int n =nums.length;
        int left=0,right=0;
        while(right<n){
            if(nums[right]!=0){
                //双指针游走
                //左指针left寻找目标值停留,右指针寻找替换值,其触发条件要确定
                //触发条件:当右指针查找到替换值时,和左指针swap
                //不是目标值左右++;
                //没目标值一起走,有目标值left停留
                swap(nums, right, left);
                left++;
            }
            right++;
        }
    }

    private static void swap(int[] nums, int right, int left) {
        int temp=nums[right];
        nums[right]=nums[left];
        nums[left]=temp;
    }
}
