package com.example.lib;

import java.util.Optional;
import java.util.function.Consumer;

public class FunInterface {
    public static void main(String[] args) {

//        Operationable operationable;
//        operationable =(a, b) -> a*b;



//        Operationable2<Integer> operationable2;
//        operationable2 =(a, b) -> a>b ;
//
//        boolean result = operationable2.calculate(10,10);
//        System.out.println(result);



//        Operationable3<Integer,String> operationable3;
//        operationable3 =(a, b) -> {
//         return    a+b + " I will be back";
//        };
//
//        String result = operationable3.calculate(10,10);
//        System.out.println(result);


//        Operationable4<Integer> operationable4;
//        operationable4 =(a, b) -> System.out.println(a+b);
//
//        operationable4.calculate(10,20);





        Optional<Integer> optInt = Optional.empty();
        if (optInt.isPresent()){

            System.out.println(optInt.get());
        }
else {
            System.out.println("no value");
        }









 //   Так было бы без лямбды
//                = new Operationable() {
//            @Override
//            public int calculate(int a, int b) {
//                return  a+b;
//            }
//        };


//        int result  = operationable.calculate(10,10);
//        System.out.println(result);

    }

//    @FunctionalInterface
//    interface  Operationable {
//
//        int calculate ( int a, int b);
//
//    }
// Predicate
//    interface  Operationable2<T> {
//
//        boolean calculate (T t, T t1 );
//
//    }


// Functional
//    interface  Operationable3<T, R> {
//
//        R calculate (T t, T t1 );
//
//    }

    //Consumer

    interface  Operationable4<T> {

        void calculate (T t, T t1 );

    }





}
