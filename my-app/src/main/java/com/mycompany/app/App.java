package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
         System.out.println("HELLO enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("name : "+name);
    }

}
