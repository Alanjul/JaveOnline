import com.fundamentals.exercise.Lesson6Exercise;
import com.fundamentals.lessons.Lesson5.Lesson5;
import com.fundamentals.lessons.Lesson5.Lesson6;
import com.fundamentals.lessons.Lesson5.Lesson7;

public class Main {
    public static void main(String[] args) {
    // write your code here

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
        lesson7Examples();



    } //end main method

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        //myLesson7.addTwoNumbers();
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