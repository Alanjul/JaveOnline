package com.fundamentals.lessons;

import com.fundamentals.DaysOfTheWeek;

/*
* This class is used for lesson 16 contents enumerations*/
public class Lesson16 {

    public enum IceCReamFlavors{ VANILA, CHOCOLATE, STRAWBERRY, ROCK_ROAD}
    public void showEnum(){
        DaysOfTheWeek d1 = DaysOfTheWeek.FRID;
        System.out.println(d1);
        System.out.println(IceCReamFlavors.CHOCOLATE);
        System.out.println(DaysOfTheWeek.SAT);
    }
    public void  myFavoriteFlavor(IceCReamFlavors flavors) {
        String message = "my favorite flavor is ";
        switch (flavors){
            case VANILA:
                message += "vanilla ";
                break;
            case CHOCOLATE:
                message += "chocolate and ";
            case STRAWBERRY:
                message += "strawBerry";
                break;
            default:
                message += "Rocky Road";
                break;

        }
        System.out.println(message);
    }
}
