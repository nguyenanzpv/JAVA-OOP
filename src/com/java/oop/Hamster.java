package com.java.oop;

import java.util.Scanner;

public class Hamster extends Pet{
    private int featherColor;

    public Hamster(){
        super();
    }

    public Hamster(String name, int age, float weight, int featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public int getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(int featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void inputPrivateInfo() {
        Scanner s = new Scanner(System.in);
        System.out.println("input feather color: ");
        System.out.println("0-Gray: ");
        System.out.println("1-White-Sprite-Black: ");
        System.out.println("2-Milk-Tea: ");
        System.out.println("3-Other: ");
        featherColor=s.nextInt();
    }

    @Override
    public void outputPrivateInfo() {
        System.out.println("Feather color: "+this.featherColor);
    }

    @Override
    public double foodMoney() {
        if((featherColor==0)||featherColor==2){
            return (this.weight+this.age)*0.02;
        }else{
            return this.weight*0.025;
        }
    }
}
