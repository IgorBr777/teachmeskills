package com.example.lib;

public class Lesson7_3 {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Mum mum = new Mum();
        checkType(parent);


        Lesson7_3 lesson7_3 = new Lesson7_3();
        System.out.println(lesson7_3.getName(""));


    }

String getName (String name){
        if (name.isEmpty()){
            return "name can't be empty";

        }

        else {
            return name;
        }

}


   static void  checkType (Object object){
        if ( object instanceof  Parent){
            ((Parent)object).walk();


        }

else  {
            System.out.println("not parent");


        }


    }


}

    class Parent {

        void walk() {
            System.out.println("parent walk");

        }
    }
    class Dad extends Parent{

        void walk (){
            System.out.println("dad walk");


        }

    }
    class Mum extends Parent{
        void walk (){
            System.out.println("mum walk");


        }

void  sleep(){
    System.out.println();

}

    }




