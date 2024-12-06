package com.phone;
import com.*;
public class Phone extends Device {

    public String makeCall(){
        this.battery-=5;
        if (this.battery<=10){
            System.out.println("Battary critical PLEASE CHARAGE !");
        }
        return String.format("You have made a Call and the Battery %d%%", this.battery);
    }

    public String playGame(){
        if (this.battery<=25){
            return "You cant play the game the battery is below 25%";
        }
        else{
            this.battery-=20;
        // if (this.battery<=10){
        //     System.out.println("Battary critical");
        // }
        return String.format("you playing a game and the battary status is %d%%",this.battery);
        }

    }

    public String phoneCharging(){
        int charge = 50;
        if (charge+this.battery>100){
            this.battery=100;
            return String.format("you have fully charged your phone and its 100%%");
        }
        else{
            this.battery+=50;

            return String.format("you have charged the phone and the battary status is %d%%",this.battery);
        }
    }

}
