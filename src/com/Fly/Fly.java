package com.Fly;

public class Fly {
    //instance variables
    private float mass;
    private double speed;
    public static final float DEFAULT_MASS = 5;
    public static final double DEFAULT_SPEED = 10;






    // main constructor
    public Fly(float initMass, double initSpeed){
        mass = initMass;
        speed = initSpeed;
    }

    //half default constructor
    public Fly(float initMass){
        this(initMass, DEFAULT_SPEED);
    }

    //default constructor
    public Fly(){
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    //**********methods*******
    //getters
    public double getSpeed(){
        return speed;
    }
    public float getMass(){
        return mass;
    }

    //setters
    public void setMass(float newMass) {
        mass = newMass;
    }
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    //toString method
    public String toString() {
        if (mass == 0) {
            return "I’m dead, but I used to be a fly with a speed of ";
        } else {
            return "I’m a speedy fly with " + speed + " speed and " + mass + " mass.";
        }
    }

    //grow method
    public void grow(int addedMass){
        mass = mass + addedMass;
        if (addedMass<20 && mass<20){
            speed = speed+1;
        } else {
            speed = speed - 0.5;
        }
    }

    //is dead method
    public boolean isDead(){
        return mass == 0;
    }

/*
    public static void main(String[] args){
    Fly ka1 = new Fly(2, 4);
    Fly ka2 = new Fly(3);
    Fly ka3 = new Fly();
    System.out.println(ka1.getMass());
    System.out.println(ka2.getMass());
    System.out.println(ka3.getMass());

    //ka1.setSpeed(5);
    System.out.println(ka1.getSpeed());
    }
*/
}       //end of class


//errors I had along the way
//https://stackoverflow.com/questions/10963775/cannot-reference-x-before-supertype-constructor-has-been-called-where-x-is-a
//https://stackoverflow.com/questions/10080862/java-class-expected