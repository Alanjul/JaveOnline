package com.fundamentals.lessons;

public  abstract class WaterBirds implements MovementInterface {
private int numbersOfWaterBirds;
private String typesOfBirds;
public WaterBirds( int newNumberofBirds, String typeofBirds ){
    this.numbersOfWaterBirds = newNumberofBirds;
    this.typesOfBirds = typeofBirds;
}
public int getWaterBirds(){
    return numbersOfWaterBirds;
}
public String getBirdType(){
    return typesOfBirds;
}
public abstract void catchFish();
public abstract void preyOnFish();
public void swim(){
    System.out.println(" waterbirds live on water by swim which prevents them from drowning. ");
}
public void breedingProcessing(){
    System.out.println("water birds depends on salty ponds for breeding process");
}
}
