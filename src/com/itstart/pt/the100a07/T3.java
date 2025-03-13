package com.itstart.pt.the100a07;

public class T3 {
    public static void main(String[] args) {
        int[] height = {1, 4, 5, 9, 5, 4, 2, 0};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        //边界条件
        if (height.length < 3 && height.length > 0) {
            return 0;
        }
        //初始化变量
        int sum = 0;
        int left = 0;
        int right = height.length - 1;
        int max_left = 0;
        int max_right = 0;
        /*双指针
        1.左右指针位置离边界距离1
        2.
        * */
        while (left < right) {
            if (height[left] < height[right]) {
                max_left = Math.max(max_left, height[left]);
                int min = max_left;
                if (min > height[left + 1]) {
                    sum = sum + max_left - height[left + 1];
                }
                left++;
            } else {
                max_right = Math.max(max_right, height[right]);
                int min = max_right;
                if (min > height[right - 1]) {
                    sum = sum + min - height[right - 1];
                }
                right--;
            }
        }
        return sum;
    }

}