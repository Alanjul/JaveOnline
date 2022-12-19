package com.fundamentals;

import com.fundamentals.exercise.*;
import com.fundamentals.lessons.*;
import com.fundamentals.lessons.Lesson5.Lesson10;
import com.fundamentals.lessons.Lesson5.Lesson5;
import com.fundamentals.lessons.Lesson5.Lesson6;
import com.fundamentals.lessons.Lesson5.Lesson7;


public class Main {
    public static int num =0;
    static{
        System.out.println("Static block1");
        num = 42;

    }// end of static b

    static{
        System.out.println("static block 2");
        num =52;
    }

    public static void main(String[] args) {
    // write your cod



        /**
         * this main class is the entry point to the  application
         **/
        //System.out.println("welcome Java");
        //System.out.println("This is my first sentence");
       // System.out.println("I am new to Java");
       // System.out.println("This JAva course is cool");
        //System.out.println("I am learning stuff every day");

        //House myHouse = new House();
        //lesson5Examples();
       // setMyInt();
       // lesson6Examples();
       // Lesson6Exercise();
        //lesson7Examples();
       // lesson7Exercise();
       // lesson8Examples();
       //Lesson8Exercise();
       //lesson9Examples();
        //lesson10Examples();
       //lesson9Exercise();
        //Lesson10Examples
       // Lesson11Examples();
        //new Lesson11Exercise();
        //Lesson13Examples();
      //  Lesson14();
       // Lesson14Exercise();
//Lesson15Example();
       // WaterBirds();
      // Lesson16();
       // Lesson16Exercise();
        //Lesson17();
        Lesson17Exercise();

    }
    public static void Lesson17Exercise(){
        Lesson17Exercise myLesson = new Lesson17Exercise();
        myLesson.exerciseTevisionCollection();
        myLesson.HouseCollection();
    }
    public static void Lesson17(){
        Lesson17 myLesson = new Lesson17();
        //myLesson.exampleArrayList();
       // myLesson.ExampleArryList();
       // myLesson.ExampleHashSet();
        myLesson.exampleHashMap();
    }
    public static void Lesson16Exercise() {
        Lesson16Exercise mylesson = new Lesson16Exercise();
        //mylesson.showMovies();
        mylesson.myFavoriteMovieGenre(Lesson16Exercise.MovieGenre.WAR_DRAMA);
    }
    public static void WaterBirds(){
        WaterBirds myBirds = new GreatEgret(5,"common moorhen");
        KingPenguin mytype = new KingPenguin(4, "little penguin");
        myBirds.swim();
        mytype.breedingProcess();
    }
    public static void Lesson16(){
        Lesson16 mylesson = new Lesson16();
       // mylesson.showEnum();
        mylesson.myFavoriteFlavor(Lesson16.IceCReamFlavors.CHOCOLATE);
        //DaysOfTheWeek d1[] = DaysOfTheWeek.values();
       // for(DaysOfTheWeek day: d1){
           // System.out.println(day + " at Index " + day.ordinal());
        }
        DaysOfTheWeek d3 = DaysOfTheWeek.WED;
      //  d3.enumMethod();
        Lesson16Lab[] labs = Lesson16Lab.values();
        //for(Lesson16Lab lab : labs ){
        //    System.out.println("labrador color " + lab.name() + " registration code: " +
                    //lab.getAction());
       // }

   // }
    public static void Lesson15Example(){
        int[] myInt = {1,2,3,4};
        Lesson15Example mybase = new Lesson15Sub(10,myInt, "turned off");
        Lesson15Sub mySub = new Lesson15Sub(13, myInt, "truned on");
        mySub.reciveCall();
        mySub.thePicture();

    }
    public static void Lesson14Exercise(){

    double voltage = Lesson14Exercise.resistanceMethod(6, 7);
    }
    public static void Lesson14(){
     // can not change values of the final
        int total = Lesson14.MY_FINAL * 35; //2145 * 35;
        System.out.println(total);
        // can change the value of non static;
        Lesson14.myFirstStatic =98;
        System.out.println(Lesson14.myFirstStatic);
        Lesson14.myFirstStaticMethod(10);
        System.out.println(" block number was " + num);
    }
    public static void Lesson13Examples(){
        House mynewHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        mynewHouse.doorOpenClose(mynewHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());
        House myHouse = new Condo();
        myHouse.doorOpenClose();
    }
    public static void Lesson11exercise(){
        Lesson11Exercise  myLesson11 = new Lesson11Exercise();
        Lesson11Exercise myOtherExerice = new Lesson11Exercise();

    }
    public static void Lesson11Examples(){
        House myHouse = new House();

        House myOtherHouse = new House();
    }
    public static void Lesson10Examples(){
        Lesson10 myLesson10 = new Lesson10();
       // Lesson10Extended myExtended = new Lesson10Extended();
       // lesson10.myDefualtMethod();

    }
    public static void lesson9Exercise(){
        Lesson9Exercise myLesson9 = new Lesson9Exercise();
        myLesson9.singleDimensionalArray();
        myLesson9.doubleDimensionArray ();
    }
    public static void lesson10Examples(){
        Lesson10 myLesson10 = new Lesson10();
        myLesson10.intialProject();
    }
    public static void lesson9Examples(){
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }
    public static void Lesson8Exercise(){
        Lesson8Exercise myLesson8 = new Lesson8Exercise();
        myLesson8.basicIfElseExercise("a", "p");
        myLesson8.basicSwitchExercise('A');
        myLesson8.basicLoopExercise();
    }
    public static void lesson8Examples(){
        Lesson8 myLesson8 =new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12, 17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108 );
        myLesson8.basicswitchExample(2);
        myLesson8.basicWhileexample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }
    public static void lesson7Exercise() {
        Lesson7Exercise myLesson7 = new Lesson7Exercise();
        myLesson7.mathProblem();
        myLesson7.exerciseModulus();
        myLesson7.exerciseAssignmentOperators();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }
    private static void Lesson6Exercise() {
        Lesson6Exercise myLesson6 = new Lesson6Exercise();
        myLesson6.exerciseChar();
        String myStr1 = myLesson6.exerciseLowerCase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exerciseUpperCase());
        myLesson6.exerciseEscape();
    }//end of method exercise


    public static void lesson6Examples() {
        Lesson6 myLesson6 =new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.examplesEquals("Happy");
        String myStr1 = myLesson6.exampleLowerCase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUpperCase());
        System.out.println(myLesson6.exampleUpperCase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("Pizza",3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    }//end method lesson6Examples
    public static void lesson5Examples(){

        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 15);
        int value = myLesson5.showLocalWithReturn(25, 19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5, 8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
        //end lesson5Examplemethod
    }
public static void setMyInt(){
        int setMyInt =0;
        double myFloat =4.12;
        setMyInt =(int)myFloat;
        System.out.println(setMyInt);
        myFloat =(float)setMyInt;
        System.out.println(myFloat);

}



} //end class