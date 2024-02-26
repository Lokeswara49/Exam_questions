package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        boolean flag=true;
        for(int i=1;i<=n;i++){
            if(flag){
                ans++;
                if(ans==5){
                    flag=false;
                }
            }
            else{
                ans--;
                if(ans==1){
                    flag=true;
                }
            }
        }
        System.out.println(ans);
    }
}
