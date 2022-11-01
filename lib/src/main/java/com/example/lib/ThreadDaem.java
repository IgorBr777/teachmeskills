package com.example.lib;

public class ThreadDaem {


    public static void main(String[] args) {
ThreadClass1 threadClass1 = new ThreadClass1();
threadClass1.setDaemon(false);
threadClass1.start();

    }

}
class ThreadClass1 extends Thread{

    @Override
    public void run() {
        System.out.println("I'm a daemon thread " +Thread.currentThread().isDaemon());
    }
}