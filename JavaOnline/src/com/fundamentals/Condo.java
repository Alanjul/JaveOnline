package com.fundamentals;

public class Condo extends House {
    private String balcony;
    public Condo(){
        System.out.println(" \ndefault condo constructor");
    }
    public Condo(String balcony) {
        this(balcony, "red", 25, "concrete",
                "shingles");
 //this.balcony = balcony;

    }
public Condo(String balcony, String doorColor, int windowSize,
            String foundation, String roofType ){
        super(foundation,roofType,doorColor,windowSize);
        this.balcony = balcony;
}
    public String getBalcony() {

        return balcony;
    }
    public void setBalcony(String balcony){
        this.balcony = balcony;
    }
    public void maintenance(){

        System.out.println("will fix condo issues");
    }
    @Override
    public void doorOpenClose(){
        super.doorOpenClose();

        System.out.println("my condo door is open");
    }
@Override
    public void doorOpenClose(String doorColor){

        System.out.println(" the condo door is " + doorColor);
    }



}
