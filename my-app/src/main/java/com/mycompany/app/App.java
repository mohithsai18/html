package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    App(){
        System.out.println("hello all devops engg..");
    }
    public String name(String name)
    {
        return "name : "+name;
    }
    public int age(int age)
    {
        return age;
    }
    public static void main(String[] args) {
        System.out.println("HELLO enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        App app = new App();
        System.out.println(app.name(name));
        System.out.println("age :"+app.age(age));
    }
    

}
