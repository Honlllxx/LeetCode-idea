package com.itstart.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Dem04 {
    public static void main(String[] args) {
       Integer [] nums={1,0,3,0,5,0,0,0};

       //创建集合存储数据
      //  List<Integer> list=Arrays.asList(nums);
        List<Integer> list =new ArrayList<>();
        for (Integer num : nums) {
            list.add(num);
        }
        System.out.println(list);
        //遍历list
        List<Integer> list2=new ArrayList<>();

           int length=list.size();
        for (int i = 0; i < length; i++) {
            if (list.get(i) == 0) {
                length--;
                list.remove(i);
                list2.add(0);
            }
        }
        System.out.println(list);
    }
    public void moveZeroes(int[] nums) {


    }
}
