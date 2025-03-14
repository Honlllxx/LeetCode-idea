package com.itstart.bMatch.true_match11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T08 {
    public static void main(String[] args) {
        growGrass();
    }
    public static void growGrass(){
        Scanner sc =new Scanner(System.in);
        List list =new ArrayList<>();
        System.out.println("请输入行列空格分隔:");
        int[]nums= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        //创建数组
        int row=nums[0];
        int line=nums[1];
        char[][]arr=new char[row][line];
        for (int i = 0; i < row; i++) {
            System.out.println("请输入行("+line+"):");
            String input=sc.nextLine();
            char[]ch=input.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                arr[i][j]=ch[j];
            }
        }
        printArr(arr);
        System.out.println("请输入增长年份:");
        int year=Integer.parseInt(sc.nextLine());
//这里的代码是错误的，直接引用了arr数组的地址，并没有创建一个新的数组。
        char [][]newArr=arr;
        for (int i=0;i<year;i++){
            /*if (i==0){
                newArr=getClose(arr);
            }else {
                newArr=getClose(newArr);
            }*/
            newArr=getClose(newArr);
        }
        printArr(newArr);
        printArr(arr);
    }

    private static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static char[][] getClose(char[][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        char [][]newArr=new char[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, newArr[i], 0, cols);
        }
        printArr(newArr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]=='g'){
                    if (i>0){
                        newArr[i - 1][j] = 'g';
                    }
                    // 下
                    if (i < rows - 1) {
                        newArr[i + 1][j] = 'g';
                    }
                    // 左
                    if (j > 0) {
                        newArr[i][j - 1] = 'g';
                    }
                    // 右
                    if (j < cols - 1) {
                        newArr[i][j + 1] = 'g';
                    }
                }
            }
        }
        return newArr;
    }
}
