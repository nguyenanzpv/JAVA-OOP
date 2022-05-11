package com.java.oop;

import java.util.Scanner;

public class Dog extends Pet {
    private float height;
    private float width;

    public Dog() {
        super();
    }

    public Dog(String name, int age, float weight, float height, float width) {
        super(name, age, weight);
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void inputPrivateInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("input height: ");
        this.height = s.nextFloat();
        System.out.print("input width: ");
        this.width = s.nextFloat();
    }

    @Override
    public void outputPrivateInfo() {
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
    }

    @Override
    public double foodMoney() {
        return this.weight*0.05;
    }
}
