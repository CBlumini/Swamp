package com.Frog;

public class Frog {
    //instance variable
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species;
    //finals should be all caps
    public static final int defaultAge=5;
    public static final double defaultTongueSpeed = 5;

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
        this(initName, defaultAge, defaultTongueSpeed);
        //this.name = name;
    }





    public static void main(String[] args) {

    }
}
