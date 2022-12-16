package com.fundamentals.lessons;

public class GreatEgret extends WaterBirds{
    public GreatEgret(int newNumberofBirds, String typeofBirds) {
        super(newNumberofBirds, typeofBirds);
    }

    @Override
    public void catchFish() {
 System.out.println("water birds are great at catching fish under the lake or river. ");
    }

    @Override
    public void preyOnFish() {
System.out.println("water birds like to pray on sea animals. ");
    }

    @Override
    public void swim() {
        System.out.println(" waterbirds live on water by swimming which prevents them from drowning. ");
    }

    @Override
    public void breedingProcess() {
        System.out.println("water birds depends on salty ponds for breeding process");
    }
}
