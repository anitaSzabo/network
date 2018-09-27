package com.codecool.network;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Connected extends Device {

    private List<Connected> connectedDevices = new ArrayList<>(); //List<Connected>?

    public Connected(int age, int batteryLife) {
        super(age, batteryLife);
    }

    public void setConnectedDevices(List<Connected> connectedDevices) {
        this.connectedDevices = connectedDevices;
    }

    @Override
    protected void calculateRemainingPower() {

    }

    public void registerDiscovery(Supplier<Stream<Connected>> connectedDiscovery) {
    }
}
