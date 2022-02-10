package com.company.datastractures;

import java.util.Scanner;

public class InitializationBlock {
    static boolean flag=true;
    static  int B,H;

    static {
        Scanner scan= new Scanner(System.in);
        B =scan.nextInt();
        scan.hasNextLine();
        H=scan.nextInt();
        scan.close();
        if (B>0 && H>0){
            flag=true;
        }
        else if (B <=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }

    public static void main(String[] args) {
        if (flag){
            int area=B*H;
            System.out.println(area);
        }

    }
}
