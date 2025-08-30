package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public String name(String name)
    {
        return "name : "+name;
    }
    public static void main(String[] args) {
        System.out.println("HELLO enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        App app = new App();
        System.out.println(app.name(name));
    }
    

}
