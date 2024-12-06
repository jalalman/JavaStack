package com;
public class Device {
    protected int battery;

    public Device(){
        this.battery=100;
    }
    public int getStatus(){

        return this.battery;
    }

}