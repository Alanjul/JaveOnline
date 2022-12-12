package com.fundamentals;

public class House {
    private String foundation;
    private String roofType;
    private String doorColor;
    private int windowSize;

    public House() {
        this("white");
        System.out.print("this is the default constructor");
        System.out.println();
    }
    public House(String doorColor) {
        this("concrete","composite","doorColor", 23);
        System.out.print("the door color is " + doorColor);
    }

    public House(String foundation, String roofType, String doorColor, int windowSize) {
        this.setFoundation(foundation);
        this.setRoofType(roofType);
        this.setDoorColor(doorColor);
        this.setWindowSize(windowSize);
    }
    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {

        this.roofType = roofType;
    }

    public void doorOpenClose() {
     System.out.println("myHouse door is closed");
    }


    public void doorOpenClose(String doorColor){

        System.out.println("The open door is "+ doorColor);
    }

    public String getDoorColor() {

        return doorColor;
    }

    public void setDoorColor(String doorColor) {

        this.doorColor = doorColor;
    }

    public int getWindowSize() {

        return windowSize;
    }

    public void setWindowSize(int windowSize) {

        this.windowSize = windowSize;
    }
}
