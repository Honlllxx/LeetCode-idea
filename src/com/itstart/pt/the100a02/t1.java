package com.itstart.pt.the100a02;

import java.lang.invoke.CallSite;
import java.util.*;

public class t1 {
    public static void main(String[]args){
        //字母异位分组
        String []arrStr={"eat","ate","boot","toob","hello","ollhe"};
        System.out.println(groupAnagrams(arrStr));

    }
    public static List<List<String>> groupAnagrams(String[]arr){
        //1.遍历数组
        /*
        * 2排序
        * 3判断是否相同,相同存储到list集合中
        * */
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>>  result=new ArrayList<>();
        for (String str : arr) {
            char[]ch =str.toCharArray();
            Arrays.sort(ch);
            System.out.println(ch);
            //获得字符串数组中排序后的结果
            String key =new String (ch);
            //判断是否存在,存在则添加到新集合中,不存在创建新集合
            //存在不创建用对应原来数组,不存在创建
            List<String> list =map.getOrDefault(key,new ArrayList<>());
            list.add(str);
            //更新map集合
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
