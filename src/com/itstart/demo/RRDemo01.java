package com.itstart.demo;

import java.lang.annotation.Target;
import java.util.*;

public class RRDemo01 {
    public static void main(String[] args) {
        /*Integer []arr={2,5,1,5,3};
        Arrays.sort(arr,(Integer o1,Integer o2 )-> {
                return o2-o1;
            }
            );
        for (int i : arr) {
            System.out.println(i);
        }*/
RRDemo01 rr = new RRDemo01();

        int [] arr={1,2,3,4,5,6,7,8,9};
        int target = 9;
        List<int[]> list = rr.twoSum(arr, target);
        for (int[] ints : list) {
            System.out.println(ints[0] + " " + ints[1] + " " );
        }

    }


    public List<int []> twoSum(int []nums, int target){
       List<int []> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                //获取对应的索引,和当前索引并储存到集合中
                result.add(new int []{map.get(target-nums[i]),i});
            }
            //第一次只储存了一个值不判断
            //键:值  值:索引
            map.put(nums[i],i);
        }

        return result;
    }


}
