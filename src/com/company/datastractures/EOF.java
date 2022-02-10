package com.company.datastractures;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i=0;
        while (scan.hasNextLine()){
            System.out.println(++i + " " + scan.nextLine());
        }


    }
}
