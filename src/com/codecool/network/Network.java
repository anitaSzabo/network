package com.codecool.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Network {

    private List<Device> deviceList = new ArrayList<>();
    private int minNumOfDevices = 4;
    private Map<String, List<Normal>> smartNotifier = new HashMap<>();
    private List<Normal> normalDevices = new ArrayList<>();
    private List<Connected> connectedDevices = new ArrayList<>();




    /*public void setDeviceAvailability(List<Device> deviceList) {
        List<Device> connectedDevices = new ArrayList<>();
        List<Device> normalDevices = new ArrayList<>();
        for(Device device: deviceList) {
            if(device instanceof Connected) {
                connectedDevices.add(device);
            } else if (device instanceof Normal) {
                normalDevices.add(device);
            }
        }
        for(Device device: deviceList) {
            if(device instanceof Connected) {
                ((Connected) device).setConnectedDevices(connectedDevices);
            } else if(device instanceof Smart) {
                ((Smart) device).setNormalDevices(normalDevices);
            }
        }
    }*/

    public void registerDevice(Smart smartDevice) {
        deviceList.add(smartDevice);
        smartDevice.setNormalDevices(normalDevices);
        //smartDevice.registerDiscovery(() -> normalDevices.stream());
    }


    public void registerDevice(Normal normalDevice) {
        deviceList.add(normalDevice);
        normalDevices.add(normalDevice);
    }

    public void registerDevice(Connected connectedDevice) {
        deviceList.add(connectedDevice);
        connectedDevices.add(connectedDevice);
        connectedDevice.registerDiscovery(() -> connectedDevices.stream().filter(d -> d!= connectedDevice));
    }


}
