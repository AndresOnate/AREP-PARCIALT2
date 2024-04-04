package org.edu.eci.arep;

import java.util.List;

public class MathUtil {

    public static int linearSearch(String[] list, String value){
        for(int i= 0; i < list.length; i++){
            if(list[i].equals(value)){
                return  i;
            }
        }
        return -1;
    }

    public static int binarySearch(int leftIndex, int rightIndex, List<Integer> list, int  value){
        int middleIndex = (rightIndex + leftIndex)/2;
        System.out.println(middleIndex);
        int middleValue = list.get(middleIndex);
        if(middleValue == value) {
            return middleIndex;
        }else if ((middleIndex == list.size()-1) || middleIndex == 0){
            return  -1;
        } else if (middleValue > value) {
            return binarySearch(0, middleIndex, list, value);
        }else {
            return binarySearch(middleIndex , list.size(), list, value);

        }
    }
}
