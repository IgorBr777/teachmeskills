package com.example.lib;

public class Daemon1 {


    public static void main(String[] args) {
ThreadsClass threadsClass = new ThreadsClass();
//threadsClass.setDaemon(false);
//threadsClass.start();


    }

}
class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("I'm a daemon thread" +Thread.currentThread().isDaemon());
    }
}