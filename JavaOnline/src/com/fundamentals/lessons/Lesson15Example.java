package com.fundamentals.lessons;
/*
* the following contents is covering lesson 15 abstract*/
public abstract class Lesson15Example implements Lesson15Interface {

    private int volume;
    private int[]numberKeys;
    private String screen;
    public Lesson15Example(int vol, int[]key, String newScreen){
        this.numberKeys = key;
        this.volume = vol;
        this.screen = newScreen;
    }

    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public String getScreen() {
        return screen;
    }
    public abstract void reciveCall();
    public abstract void sendCall();
    public abstract void endCall();
    public void thePicture(){
        System.out.println("take a picture ");
    }
}
