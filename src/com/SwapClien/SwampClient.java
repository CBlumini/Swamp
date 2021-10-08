package com.SwapClien;

import com.Fly.Fly;
import com.Frog.Frog;

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

        Frog froggy = new Frog("Carl", 2, 3.2);
        Frog froggy2 = new Frog("Joe", 2.0, 3.2);
    }
}
