package com.itstart.bMatch.true_match11;

import java.util.Scanner;

/*小明想知道，满足以下条件的正整数序列的数量：
1. 第一项为 n；
2. 第二项不超过 n；
3. 从第三项开始，每一项小于前两项的差的绝对值。
请计算，对于给定的 n，有多少种满足条件的序列。*/
public class T09 {
    public static void main(String[] args) {
        System.out.println(getOrderCount());
    }
    public static int getOrderCount(){
        Scanner sc =new Scanner(System.in);
        System.out.println("输入一行包含一个整数n:");
        int n=Integer.parseInt(sc.nextLine());
        int count=0;
        for (int i = 1; i <=n; i++) {
            count++;
            System.out.println(""+n+i);
            for (int j = 1; j < Math.abs(n-i); j++) {
                count++;
                System.out.println(""+n+i+j);
            }
        }
      return count;
    }
}
