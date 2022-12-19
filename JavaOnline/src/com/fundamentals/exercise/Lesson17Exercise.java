package com.fundamentals.exercise;

import com.fundamentals.Television;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson17Exercise {

    public void exerciseTevisionCollection(){
        List<Television> list = new ArrayList<>();
        list.add(new Television("5"));
        list.add(new Television("50"));
        list.add(new Television("70"));
        list.add(new Television("85"));
        for( Television lists : list){
            System.out.println(lists.getScreenSize());

        }// end of foreach loop
    }// end of television method
    public void HouseCollection(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(15, "windows");
        myMap.put(5, "Doors");
        myMap.put(2, "bedroom");
        myMap.put(4, "bathroom");
        for(Map.Entry< Integer, String> map: myMap.entrySet()){
            System.out.println(map.getKey() + " = " + map.getValue());
        }// end  of for loop

    }
}
