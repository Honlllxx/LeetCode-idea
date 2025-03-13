package com.itstart.pt.the100a04;

public class T1 {
    /*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。*/
    public static void main(String[] args) {
       int []nums ={0,2,3,5,70,0,0,0,5,0};
     //   int[]nums={0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void moveZeroes(int[] nums) {
        //双指针遍历交换
        int left=-1,right,n=1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==0){
                //记录0的位置
                left=i;
            }else {
                continue;
            }
            //从left0的位置开始找,忽略已经交换的项
            for (int j = left; j < nums.length; j++) {
                if (nums[j]!=0){
                    right=j;
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left=right;
                }
            }
        }
    }
}
