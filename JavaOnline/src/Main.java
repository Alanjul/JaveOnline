import com.fundamentals.lessons.Lesson5.Lesson5;

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
        lesson5Examples();



    } //end main method

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,15);
        int value = myLesson5.showLocalWithReturn(25,19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5,8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
    } // end lesson5Example method



} //end class