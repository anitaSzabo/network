package com.codecool.network;

public abstract class Device {
    protected int age;
    protected int batteryLife;

    public Device(int age, int batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
    }

    protected abstract void calculateRemainingPower();
}
