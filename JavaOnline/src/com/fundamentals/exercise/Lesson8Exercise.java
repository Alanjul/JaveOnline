package com.fundamentals.exercise;

public class Lesson8Exercise {
    public static void basicIfElseExercise(){
        String a = "good";
        String b = "good";
        System.out.println("before if else statement");
        if (a != b) {
            System.out.println("they are not equal");
        } else {
            System.out.println("they are equa;");
        }
        System.out.println("end of if else statement");
    }// end of method basic if else statement

    public void basicSwitchExercise(){
        char grade = 'p';
        switch (grade) {
            case 'E':
                System.out.println("Excellent");
                break;
            case 'V':
                System.out.println("Very Good");
                break;
            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a Valid grade'.");
        } // end of switch
    }// end of method basic switch exercise
    public  void basicLoopExercise() {
        for (int num =0; num <=30;num++ ) {
            if (num % 3 ==0) {
                System.out.println(num);
            }

        } // end loop
    }// end of method basicLoopExercise

}// end of class
