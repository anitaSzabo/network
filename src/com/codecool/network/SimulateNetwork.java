package com.codecool.network;

public class SimulateNetwork {

    Network simulatedNetwork;

    public SimulateNetwork(Network simulatedNetwork) {
        this.simulatedNetwork = simulatedNetwork;
    }

    public static void main(String[] args) {
        Network network = new Network();
        SimulateNetwork simulateNetwork = new SimulateNetwork(network);
        simulateNetwork.createDevices();
        simulateNetwork.simulateAYear();
    }


    public void createDevices() {
        simulatedNetwork.registerDevice(new Smart(10, 90, "MySmartDevice1"));
        simulatedNetwork.registerDevice(new Normal(1, 20));
        deviceList.add(new Connected(2, 20));

    }

    public void simulateAYear() {
        for (int i = 0; i < 50; i++) {
            for(Device device: deviceList) {
                device.calculateRemainingPower();
            }
        }
    }
}
