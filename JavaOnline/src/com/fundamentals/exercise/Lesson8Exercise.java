package com.fundamentals.exercise;

public class Lesson8Exercise {
    public void basicIfElseExercise(String Good,String good){


        System.out.println("before if else statement");
        if (good != Good) {
            System.out.println("they are not equal");
        } else {
            System.out.println("they are equal;");
        }
        System.out.println("end of if else statement");
    }// end of method basic if else statement

    public String basicSwitchExercise(char Grade){
        Grade = 'p';
          switch(Grade) {
            case 'E':
                return "excellent";
             case 'V':
                return ("Very Good");

            case 'G':
                return ("Good");

            case 'A':
                return ("Average");
            case 'F':
                return ("Fail");
            default:
                return("Not a Valid grade'.");
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
