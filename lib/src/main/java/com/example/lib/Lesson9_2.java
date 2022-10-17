package com.example.lib;

import java.util.Arrays;

public class Lesson9_2 {
    public static void main(String[] args) {

        int[] temp = new  int []{16,-17,22,0,1,33,5,4,7};
        double averageTemp;
        int sumofTemp =0;
        for (int i =0; i<temp.length; i++){
            sumofTemp +=temp[i];

        }
       averageTemp = (double) sumofTemp/temp.length;
        System.out.println(averageTemp);

        int[] temps = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

//        int maxV;
//        int minV;
//
//        Arrays.sort(temps);
//        minV = temps[0];
//        maxV = temps[temps.length - 1];
//
//
//        System.out.println("minValue:" + minV +" MaxValue:" + maxV);

    }

}



