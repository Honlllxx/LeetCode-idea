package com.itstart.demo;
//双指针
//移动零
//
public class RDemo04 {
    public static void main(String[] args) {
        int [] nums = {1,4,0,0,5,0,0,0,9};
        RDemo04 demo = new RDemo04();
        demo.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }//
    //思想:
    //遇到零:left记录当前位置
    //在未遇到其他不为零的数,right查找
    //遇到不为零的数,与left位置交换
    //其中不便用list集合删除,容量变动
    
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        //如果不为0指针都加一
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


}
