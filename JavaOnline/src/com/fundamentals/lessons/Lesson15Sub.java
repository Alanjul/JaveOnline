package com.fundamentals.lessons;
/* this the subclass of abstract class */
public class Lesson15Sub extends Lesson15Example {
    public Lesson15Sub(int volume, int[]key, String newScreen){
      super(volume,key,newScreen) ;
    }
    @Override
    public void reciveCall() {
System.out.println("receive a call ");
    }

    @Override
    public void sendCall() {
        System.out.println("send call ");

    }

    @Override
    public void endCall() {
        System.out.println("end a call ");

    }
    @Override
    public void thePicture(){
        System.out.println("take the picture");
    }
}
