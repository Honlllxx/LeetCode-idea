package com.itstart.bMatch.true_match11;

import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        getThreeCount();
    }
    public static void getThreeCount() {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int len=Integer.parseInt(sc.nextLine());
        System.out.println("请输入数组内容,空格分隔:");
      int []nums=Arrays.stream(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt)
                .toArray();

      int right=nums.length-1;
        int num=1;
        for (int i=0;i<right;i++) {
            int left=i;
            while(left<=right){
                if (nums[left]< nums[right]){
                     for (int j=left+1;j<right;j++){
                         num=nums[left]<nums[j]&&nums[j]<nums[right] ?0:1;
                         if (num==0){
                             count++;
                             num=1;
                         }
                     }
                }
                right--;
            }
        }
        System.out.println(count);
    }
}