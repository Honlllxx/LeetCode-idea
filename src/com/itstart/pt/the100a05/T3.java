package com.itstart.pt.the100a05;

import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        //int []height ={1,8,6,2,5,4,8,3,7};
        int[]height={6,2,2,2,7};
        System.out.println(maxArea(height));

    }



    public static  int maxArea (int[]height){
        int maxArea =0;
        for (int i = 0; i < height.length; i++) {
            for (int j =i+1 ; j < height.length; j++) {
                maxArea=Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxArea;
    }
}
