package com.example.lib;

public class MultiThreads {

// Воспроизведение состояния  Race Condition
    public static void main(String[] args) {

        ThreadsClass threadsClass = new ThreadsClass();

        Thread thread1 = new Thread(threadsClass);
        thread1.start();
        Thread thread2= new Thread(threadsClass);
        thread2.start();

    }

}
class ThreadsClass implements  Runnable{
private  int count =0;

    @Override
    public void run() {

        for (int i =0; i<10; i++){
            count++;
            System.out.print(count + " ");

        }

    }
}