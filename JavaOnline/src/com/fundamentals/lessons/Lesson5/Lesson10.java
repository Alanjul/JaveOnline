package com.fundamentals.lessons.Lesson5;
/*
* Author Julius Niyonzima
* display authors initials
* */

public class Lesson10 {
    // this method shows how to design name pattern.
    public void designNamePattern(){
        int n=6;
        int k=1;


        for(int row =1; row<=6;row++){
            for(int j=0; j<=n; j++){
                if(j==0||j==1||j==k )
                System.out.print("J ");
                else
                    System.out.print("N ");
            }
            k++;
            System.out.println();



        }




    }// end of name pattern
}// end of class
