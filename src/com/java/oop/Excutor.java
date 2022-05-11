package com.java.oop;

import java.util.Scanner;

public class Excutor {
    public static void main(String[] args){
        NgoiNha nha=new NgoiNha();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please input info ....");
        Pet p = new Dog();
        p.inputInfo();
        nha.addPet(p);
        Pet p2 = new Cat();
        p2.inputInfo();
        nha.addPet(p2);
        Pet p3 = new Hamster();
        p3.inputInfo();
        nha.addPet(p3);
        System.out.println("Display info pets....");
        nha.printPet();
        System.out.println("Total money food for Pet house....");
        System.out.println(nha.totalFoodMoney());
    }
}
