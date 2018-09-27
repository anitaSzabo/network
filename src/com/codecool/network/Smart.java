package com.codecool.network;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Smart extends Device {

    private Screensize screensize;
    private String name;
    private List<Normal> normalDevices;
    private Supplier<Stream<Normal>> normalDiscovery;


    public Smart(int age, int batteryLife, String name) {
        super(age, batteryLife);
        this.name = name;
    }

    List<Normal> getDeviceListRef(){
        return normalDevices;
    }

    public void setNormalDevices(List<Normal> normalDevices) {
        this.normalDevices = normalDevices;
    }

    @Override
    protected void calculateRemainingPower() {

    }

    public String getName() {
        return name;
    }

    public void setDeviceListRef(List<Normal> normalDevices) {

    }

    public void registerDiscovery(Supplier<Stream<Normal>> normalDiscovery) {
        this.normalDiscovery = normalDiscovery;
    }

    public List<Normal> collectNormals() {
        if(discoveryRegistered()){
            return normalDiscovery
                    .get()
                    .filter(this::insideRange)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    private boolean insideRange(Normal normal) {
        //todo
        return true;
    }

    private boolean discoveryRegistered() {
        return normalDiscovery!=null;
    }
}
