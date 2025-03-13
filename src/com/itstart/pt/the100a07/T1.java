package com.itstart.pt.the100a07;

public class T1 {
    public static void main(String[] args) {
        int [] height ={1,4,5,9,5,4,2,0};
        System.out.println(trap(height));

    }
    public static int trap(int[] height) {
        // 如果数组长度小于 3，无法困住雨水，直接返回 0
        if (height.length < 3) {
            return 0;
        }
        //储存容器 : sum
        int sum = 0;
        //左指针最大数&右指针最大数
        int max_left = 0;
        int max_right = 0;
        //左指针开始位置
        int left = 1;
        //右指针开始位置
        int right = height.length - 2;
        // 使用双指针法，当 left 小于 right 时继续循环
        while (left <= right) {
            if (height[left - 1] < height[right + 1]) {
                // 更新左侧最大高度
                max_left = Math.max(max_left, height[left - 1]);
                //赋值当前左侧最大值给min
                int min = max_left;
                //当前高度不是最大高度
                if (min > height[left]) {
                    // 计算当前位置能困住的雨水量并累加到总和中
                    sum = sum + (min - height[left]);
                }
                left++;
            } else {
                // 更新右侧最大高度
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    // 计算当前位置能困住的雨水量并累加到总和中
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }

}
