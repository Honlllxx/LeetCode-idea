package com.itstart.demo;

import java.util.*;
import java.util.stream.Collectors;

public class RDemo02 {

        public List<List<String>> groupAnagrams(String[] strs) {
            return new ArrayList<>(Arrays.stream(strs)
                    .collect(Collectors
                            .groupingBy(s -> Arrays.toString(s.codePoints().sorted().toArray()))).values());
        }



    public List<List<String>>  getWordsSorted(String[] words) {
        Map<String ,List<String>> map=new HashMap<>();
        for (String word : words) {
            //获取每个单词的字母并排序
            char []chars=word.toCharArray();
            //排序
            Arrays.sort(chars);
            //获取排序后的数组chars
            //并转化成字符串
            String key=new String(chars);
            //集合添加
            //需要存在添加到对应集合,不存在新建集合
            //寻找方法 map.getOrDefault()   ;
            List<String> list=map.getOrDefault(key,new ArrayList<String>());

            list.add(word);

            map.put(key,list);


        }
        //把map.values()赋值给ArrayList<List<String >>
        return new ArrayList<List<String >> (map.values());

    }

}
