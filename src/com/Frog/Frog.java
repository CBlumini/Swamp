package com.Frog;

import com.Fly.Fly;

public class Frog {
    //instance variable
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species;
    //finals should be all caps
    public static final int DEFAULT_AGE =5;
    public static final double DEFAULT_TONGUE_SPEED = 5;

    //*******************Constructors******************
    //main constructor
    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed=tongueSpeed;
    }
    //ageInYears constructor
    //how do I chain this?
    public Frog(String initName, double ageInYears, double initTongueSpeed){
        this(initName, (int) (ageInYears*12), initTongueSpeed);
        //this.age = (int) (ageInYears*12);
        //this.tongueSpeed=tongueSpeed;
        //this.name = name;
    }
    //default constructor
    public Frog(String initName){
        this(initName, DEFAULT_AGE, DEFAULT_TONGUE_SPEED);
        //this.name = name;
    }

    //*****************METHODS******************************
    //getters
    public static String getSpecies() {
        return species;
    }

    //setters
    public static void setSpecies(String species) {
        Frog.species = species;
    }

    //toString
    public String toString(){
        if (isFroglet){
            return "My name is " + name + " and I’m a rare froglet! I’m " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        } else {
            return "My name is " + name + " and I’m a rare frog. I’m " + age + " months old and my tongue has a speed of " + tongueSpeed+ ".";
        }
    }

    //Grow Method
    public void grow(int addMonths){
        for (int i = 0; i <= addMonths; i++) {
           if (age<=12){
               age++;
               tongueSpeed++;
               isFroglet = age > 1 && age < 7; //simplified if else statement that gives a boolean value to isFroglet
           } else if (age<30){
               age++;
           } else if(tongueSpeed>5){
               age++;
               tongueSpeed--;
           } else{
               age++;
           }
        }
    }
    public void grow(){
        age++;
        if (age<=12){
            tongueSpeed++;
            isFroglet = age > 1 && age < 7; //simplified if else statement that gives a boolean value to isFroglet
        } else if(age>30 && tongueSpeed>5){
            tongueSpeed--;
        }
    }

    //Eat Method
    public void eat(Fly food){
        if(food.isDead()){
            return; //do I really need this?
        } else if(food.getSpeed()<tongueSpeed){
            if (food.getMass() >= age*0.5){
                grow();
                food.setMass(0);
            }
        } else {
            food.grow(1);
        }
    }

/*

    public static void main(String[] args) {

    }

 */
}
