package com.example.lib;

public class MultiThreadsSynchronized_2 {

    public static void main(String[] args) {

        CountThread2 countThread2 = new CountThread2();
        Thread thread1= new Thread(countThread2);
        thread1.start();
        Thread thread2= new Thread(countThread2);
        thread2.start();

        }

    }




class CountThread2 implements  Runnable{

    private  int count =0;
    synchronized void changeValue(int addValue){
        for (int i =0; i<10; i++){
            count=addValue;
            System.out.println(count + " ");

        }


    }

    @Override
    public void run() {

           for (int i = 0; i<10; i++)   {

               changeValue(i);
           }

                }
            }







