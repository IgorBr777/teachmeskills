package com.example.lib;


import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number");
        if (scanner.hasNextInt()){

        int enteredValue  = scanner.nextInt();
        System.out.println("Your value is:" +enteredValue);
    }
        else {
            System.out.println("");

        }
    }

}
