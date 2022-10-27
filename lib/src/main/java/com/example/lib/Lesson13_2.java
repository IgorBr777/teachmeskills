package com.example.lib;

public class Lesson13_2 {
    public static void main(String[] args) {
Runnable runnable = new Runnable() {
    @Override
    public  void run(){

        System.out.println("I'm running in runnable");

    }
};
        Thread thread1 = new Thread(runnable);
        thread1.start();


    // Переопределение логики, которая будет выполняться на другом потоке
//        ThreadClass3 threadClass3 = new ThreadClass3(){
//
//            @Override
//            public  void  run(){
//                System.out.println("Run im Thread in anonym class");
//
//            }
//        };

     //   threadClass3.start();


        }

    }

    class ThreadClass3 extends  Thread{
        @Override
        public void run (){
            System.out.println("I'm running in Thread ");

        }


    }

    class  ThreadClass4 implements Runnable{

        @Override
        public void run() {

        }
    }









