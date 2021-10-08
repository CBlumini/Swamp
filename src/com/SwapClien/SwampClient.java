package com.SwapClien;

import com.Fly.Fly;

public class SwampClient {
    public static void main(String[] args){
        Fly ka1 = new Fly(2, 4);
        Fly ka2 = new Fly(3);
        Fly ka3 = new Fly();
        System.out.println("fly 1 mass is " + ka1.getMass());
        System.out.println("fly 2 mass is " + ka2.getMass());
        System.out.println("fly 2 mass is " + ka3.getMass());

        ka1.setSpeed(25);
        System.out.println("fly 1 speed is " + ka1.getSpeed());
    }
}
