package com.codecool.network;

public class Normal extends Device {

    private Screensize screensize;
    private int yearManufactured;

    public Normal(int age, int batteryLife) {
        super(age, batteryLife);
    }


    @Override
    protected void calculateRemainingPower() {

    }
}
