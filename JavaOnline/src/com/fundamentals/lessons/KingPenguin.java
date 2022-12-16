package com.fundamentals.lessons;

public class KingPenguin extends WaterBirds{
    public KingPenguin(int newNumberofBirds, String typeofBirds) {
        super(newNumberofBirds, typeofBirds);
    }

    @Override
    public void catchFish() {
 System.out.println("Catch the fish to eat in water.");
    }

    @Override
    public void preyOnFish() {
        System.out.println("fish are great source of prey for waterbirs");

    }

    @Override
    public void swim() {
        System.out.println(" waterbirds live on water by swim which prevents them from drowning. ");
    }

    @Override
    public void breedingProcess() {
        System.out.println("water birds depends on salty ponds for breeding process");

    }
}
