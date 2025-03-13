package com.itstart.pt.the100a05;

import java.util.Map;
//myP
public class T1 {
    /*给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

返回容器可以储存的最大水量。*/
    public static void main(String[] args) {
       int []height ={1,8,6,2,5,4,8,3,7};
     //   int[]height={1,1};
        System.out.println(maxArea(height));

    }

    public  static  int maxArea(int[] height) {
        //容量宽度和高度差判定
        int range,alti;
        int maxArea=0;
        int area=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (i!=j ) {
                    range= j>i? j-i:i-j;
                    alti= height[i]>height[j]?height[j]:height[i];
                    area=range*alti;
                }
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}
