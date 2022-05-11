package com.java.oop;

import java.util.Scanner;

public class Cat extends Pet{
    private String type;

    public Cat() {
        super();
    }

    public Cat(String name, int age, float weight, String type) {
        super(name, age, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void inputPrivateInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("input type: ");
        this.type = s.nextLine();
    }

    @Override
    public void outputPrivateInfo() {
        System.out.println("Type: "+this.type);
    }

    @Override
    public double foodMoney() {
        return (this.weight-1)*0.04;
    }
}
