package com.example.lib;

import java.io.FileNotFoundException;

public class lesson8_2 {

    public static void main(String[] args) {
      //  throwUnCheckedException();
//      try {
//          throwCheckedException();
//      }catch (Exception e){
//          System.out.println("handle checked exception");
//      }
//
//      try {
//throwCheckedException();
//
//      }
//catch (Exception e){
//    System.out.println(e.getCause());
//
//}
    }


    static  void throwUnCheckedException( ) throws NullPointerException{
        throw new NullPointerException("rinTime");

    }
    static  void throwCheckedException( ) throws FileNotFoundException {
        throw new FileNotFoundException("compileTime");

    }

}
