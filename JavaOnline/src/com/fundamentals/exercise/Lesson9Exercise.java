package com.fundamentals.exercise;

public class Lesson9Exercise {
    public void singleDimensionalArray(){
        String[] stringArrays = {"vanilla", "Chocolate", "strawberry", "butter pecan"};

        for(int n= 0; n< stringArrays.length; n++){
            System.out.println(stringArrays[n]);
        }// end of loop
    }// end of single dimension array
    public void doubleDimensionArray(){
        int[][]score1 = {{40, 28},{33, 34}}; int score3[][] ={{26,10},{28,34}};
        int score0[][] = {{13,24},{30, 24}}; int score4[][] ={{19,31},{6,31}};
        int score[][] ={{26,35},{24,40}};   int score5 [][] ={{23,35},{17,9}};
        int score2[][]=   {{23,23},{26,31}}; int score6 [][] ={{16,3},{3,21}};
        System.out.println("chiefs vs opponents in 2019 season ");
        for (int n=0; n<score1.length; n++){
            for (int k =0; k<score1[n].length;k++){
                //System.out.print("Kansas city chiefs scores in 2019:");
                System.out.println(score1[k][n]+"\t" + score3[k][n] + "    \t");
                System.out.println(score0[k][n] + "\t" + score4[k][n] + "   \t");
                System.out.println( score[k][n]+ "\t" + score5[k][n] + "   \t");
                System.out.println( score2[n][k] + "\t"+ score6[k][n]+ "   \t");
            }
        }
    }// end of the double dimensional array
}// end of the main class
