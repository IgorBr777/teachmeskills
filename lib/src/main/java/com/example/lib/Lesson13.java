package com.example.lib;
// Первый способ  создания потоков
public class Lesson13 {
    public static void main(String[] args) {

//        ThreadClass1 threadClass1 = new ThreadClass1();
//        threadClass1.start();
//
//        ThreadClass2 threadClass2 = new ThreadClass2();
//        Thread thread1 = new Thread(threadClass2);
//        thread1.start();




    }

}

class ThreadClass1 extends  Thread{
    @Override
    public void run (){
        System.out.println("I'm running in Thread ");

    }


}

class  ThreadClass2 implements Runnable{

    @Override
    public void run() {

    }
}