package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson11_1 {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.offer("Hello");
        queue.offer("Bye");
        queue.offer("World");

        System.out.println(queue);
        queue.remove(1);
        System.out.print(queue);





       }



    }






 //   Object [] numbers = new int[]{3,1,4,6,2,5,7,9,8};
//
//        List arrayList = new ArrayList(Arrays.asList(numbers));
//        Collections.sort(arrayList);
//        Collections.reverse(arrayList);
//        arrayList.toArray();
//       for (int value =0; value <arrayList.size(); value++) {
//           System.out.print(arrayList.get(value) + " ");