package com.itstart.bMatch.true_match16;

import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=0;
        t=scanner.nextInt();
        int x=0;
        while((t--)>0){
            int n = scanner.nextInt();
            x=0;
            for(int i=0;i<n;i++){
                x^=scanner.nextInt();
            }
            if(x==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}