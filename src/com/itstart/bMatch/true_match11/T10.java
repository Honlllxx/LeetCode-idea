package com.itstart.bMatch.true_match11;

import java.util.*;

public class T10 {
    public static void main(String[] args) {
        orderTv();

    }
    public static void orderTv(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入表示节目的数量和选择的数量");
        int [] sumAndDel= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=sumAndDel[0];
        int del=sumAndDel[1];
        int cut=sum-del;

        System.out.println("请输入每个节目好看值");
        int [] likes=Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] tempArr =new int[sum];
        System.arraycopy(likes,0,tempArr,0,likes.length);
        Arrays.sort(tempArr);
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i]);
        }

        List<Integer> list=new ArrayList<>();
        for (int i = cut; i < sum; i++) {
            list.add(tempArr[i]);
        }
        System.out.print(list);
        int []newLikes=new int[del];
        List<Integer> newList=new ArrayList<>();

        for (int i = 0; i < sum; i++) {
            if (list.contains(likes[i])){
                newList.add(likes[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            newLikes[i]=newList.get(i);
        }
        System.out.println();
        for (int i = 0; i < newLikes.length; i++) {
            System.out.print(newLikes[i]);
        }
    }
}
