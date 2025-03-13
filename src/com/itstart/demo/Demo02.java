package com.itstart.demo;


import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo = new Demo02();

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = demo.groupAnagrams(str);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        //创建map集合
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //遍历源字符串
        for (String str : strs) {
            //获取各个单词的字母
            char[] array = str.toCharArray();
            //把各个单词字母排序
            Arrays.sort(array);
            //转换成字符串
            //因为排序后所有相同字母的单词都一样,集合可以覆盖
            String key = new String(array);
            //如果key不存在则返回新的list
            //如果存在返回key在map中对应的值
            //第一次都是空
            //后面如果key存在就在原集合基础上添加新元素
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            //并把字符串添加到list中
            list.add(str);
            //map集合添加key,list  逐渐覆盖
            map.put(key, list);
        }
        //返回所有map集合中value值赋值给ArrayList<List<String>>
  return  new ArrayList<List<String>>(map.values());
    }
    }

