package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        for ( char i = 'a'; i <= 'z'; i++ ) {
            System.out.print(st.indexOf(i) + " ");
        }
    }
}
