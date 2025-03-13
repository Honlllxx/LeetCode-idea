package com.itstart.pt.the100a07;

public class T2 {

    public static void main(String[] args) {
        int [] height ={1,4,5,9,5,4,2,0};
        System.out.println(trap(height));
    }
    public static int trap(int []height){
        int sum =0 ;
        int max_left=0;
        int max_right=0;
        int left=1;
        int right=height.length-2;
        //循环次数终止条件错误,导致其到达终止条件会继续循环,做右指针继续走
        while(left<=right) {
            if(height[left-1]<height[right+1]){
                max_left =Math.max(max_left, height[left-1]);
                int min =max_left;
                if (min>height[left]) {
                    sum=sum+(min-height[left]);
                }
                left++;
            }else{
                max_right =Math.max(max_right, height[right+1]);
                int min =max_right;
                if(min>height[right]){
                    sum=sum+(min-height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}
