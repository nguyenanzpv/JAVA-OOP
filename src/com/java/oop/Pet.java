package com.java.oop;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public abstract class Pet implements calculateFood{
    protected String name;
    protected float age;
    protected float weight;

    protected double totalMoney=0.0;
    public Pet(){

    }

    public Pet(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public abstract void inputPrivateInfo();
    public abstract void outputPrivateInfo();

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name: ");
        this.name = scanner.nextLine();
        System.out.print("input age: ");
        this.age = scanner.nextFloat();
        System.out.print("input weight: ");
        this.weight = scanner.nextFloat();

        inputPrivateInfo();
    }

    public void outputInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Weight: "+this.weight);

        outputPrivateInfo();
    }
}
