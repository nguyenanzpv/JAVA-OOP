package com.java.oop;

import java.util.ArrayList;

public class NgoiNha {
    private ArrayList<Pet> p;

    protected double totalMoney=0.0;

    public NgoiNha(){
        p=new ArrayList<Pet>();
    }

    public NgoiNha(ArrayList<Pet> p){
        this.p=p;
    }

    public void addPet(Pet p){
        this.p.add(p);
    }

    public void printPet(){
        for(Pet p : p){
           p.outputInfo();
        }
    }

    public double totalFoodMoney(){
        for(Pet p:p){
            totalMoney += p.foodMoney();
        }
        return totalMoney;
    }
}
