package com.fundamentals.lessons;

import com.fundamentals.House;

import java.util.*;

/*  The java.util.* should not be used in favor of individual imports due to memory limitation
* don't import  class you don't need to use.
*this class goes over 17 lesson collection frame work
 */
public class Lesson17 {
    // this method will show arrayList of sting
    public void ExampleArryList(){
        List< String>list = new ArrayList<>();
        list.add("Happy");
        list.add("Tuesday");
        list.add("not Monday");
        list.add("where \'s Friday");

        for(int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }// end for loop
    }// end the method

    // this method will show array list of house.
    public void exampleArrayList(){
        ArrayList<House>myHouse = new ArrayList<House>();
        myHouse.add(new House("red"));
        myHouse.add(new House("green"));
        myHouse.add(new House("Blue"));
        myHouse.add(new House("White"));
        for(int i =0; i < myHouse.size(); i++){
            System.out.println(myHouse.get(i).getDoorColor());
        }// end of for loop
    }// end method example arraylist 2;

    // this method will show a hashst example
    public void ExampleHashSet(){
        HashSet<String>myHash =new HashSet<>();
        myHash.add("firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        Iterator<String> iterator = myHash.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }// end method hash set
    // this method will show map example;
    public void exampleHashMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(20, "Days");
        myMap.put(30, "are here");
        myMap.put(40, "Happy");
        for(Map.Entry< Integer, String> map: myMap.entrySet()){
            System.out.println(map.getKey() + " = " + map.getValue());
        }// end  of for loop

    } // end of example has method
}// end class.
