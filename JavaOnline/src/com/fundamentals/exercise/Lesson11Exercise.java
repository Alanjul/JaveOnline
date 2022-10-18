package com.fundamentals.exercise;

public class Lesson11Exercise {
   private double screenSize;
   private  double price;
   private  String ports;
   private String isMountable;
     private String tel;
     String televisionSet;

    public Lesson11Exercise( ) {
        System.out.print("the television is turn on");
    }
    public Lesson11Exercise(double screenSize, String ports) {
        this(6.0, "ports",7800.50, "mountable" );
    }
    public Lesson11Exercise(double screenSize, String port, double price, String isMountable){
        this.screenSize = screenSize;
        this.price =price;
        this.isMountable = isMountable;
        this.ports =ports;

    }
    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }
    public double getScreenSize(){
        return screenSize;
    }

    public void setPrice(double price){
        this.price =price;
    }

    public double getPrice(){
        return price;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public String getIsMountable() {
        return isMountable;
    }

    public void setIsMountable(String isMountable) {
        this.isMountable = isMountable;
    }

}