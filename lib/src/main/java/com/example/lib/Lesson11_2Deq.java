package com.example.lib;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Lesson11_2Deq {

    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(" ios developer");
        arrayDeque.addFirst(" android developer");
        arrayDeque.addLast(" python developer");
        arrayDeque.push(" flutter developer");

        System.out.println(arrayDeque);
      //  System.out.println(arrayDeque.peekLast());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.print(arrayList.get(2));
    }


}
