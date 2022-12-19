package com.fundamentals.exercise;

public class Lesson11Exercise {
    private  String ports;

   private double screenSize;
    private  double price;

   private String isMountable;
     private String tel;
     String televisionSet;

    public Lesson11Exercise( ) {
        this("76");
       System.out.println(" this is the default constructor");
    }
    public Lesson11Exercise(String ports) {
        System.out.println("the screen size is" + ports);
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