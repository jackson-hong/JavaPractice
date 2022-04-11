package com.example.design.patterns.strategy.after;

// Context
public class BlueLightRedLight {

    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight(){
        speed.blueLight();
    }

    public void redLight(){
        speed.redLight();
    }

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Faster());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
