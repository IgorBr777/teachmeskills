package com.example.lib;

public class Lesson9 {


    public static void main(String[] args) {
        String[] massive = {"hello", "bye", "world"};
        int[] massive2 = new int[]{};
        massive2[0] =1;
        massive2[1] =2;
        massive2[2] =3;
        massive2[3] =4;
        massive2[4] =5;
        String[] massive3 = new String[]{"buy", "buy","buy","buy","buy",};

        System.out.println(massive[1]);
        for (int i =0; i<=massive.length-1;i++) {
            System.out.println(massive[i] + "\n");
        }

            for (int i =0; i<=massive2.length-1;i++){
                System.out.println(massive2[i]+"\n");



        }
    }

}