package com.fundamentals.lessons;
/*
* the content of this class is for lesson9 arrays
* */
public class Lesson9 {

    // This method shows a basic single dimension array
    public void basicIntArray(){
        int[] IntArray ={23,45,12,8,95,103,37};
        for(int i = 0; i < IntArray.length; i++){
            System.out.println(IntArray[i]);
        }// end of for loop
    } // end method basic int array
    // this method shows a multidimension array 2D
    public void basicTwoDimensionalArray(){
        int[][] myArray ={{23,45},{35,46}};
        int[][] myj ={{43, 20}, {40, 50}};
        for (int i =0;i < myArray.length;i++ ){
            for(int l =0; i<myArray.length;l++)
            for(int m=0; m<myj.length; m++){
                System.out.println(myArray[i][l]);
                System.out.println(myj[m]);
            }// end of inner for loop
        } // end of outer for loop
    }// end of basic two dimension array

    // this method shows a 3d array
    public void basicThreeDimensionalArray(){
        int[][][] arr = new int[2][2][2];
        arr[0][0][0] = 10;
        arr[0][0][1] = 12;
        arr[0][1][0] = 13;
        arr[0][1][1] =14;

        arr[1][0][0] =15;
        arr[1][1][0] =16;
        arr[1][0][1] =17;
        arr[1][1][1] =18;

        for(int i =0; i<arr.length; i++){
            for(int k= 0; k<arr[i].length;k++){
                for(int m =0; m< arr[k].length; m++){
                    System.out.println(arr[i][k][m]);
                }// end the inner most loop
            }// end the inner loop
        }// end of outer loop
    }// end of basic three dimension array

    // this method show the jagged array
    public void basicJaggedArray(){
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "July";
        stringArray[0][2] = "August";
        for (int i =0; i < stringArray.length; i++){
            for(int k =0; k<stringArray[i].length; k++){
                System.out.println(stringArray[i][k]);
            }// end of inner most loop
        }// end of outer loop
    }// end of basic jagged array
}// end class
