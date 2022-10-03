package com.example.lib;
// Запрет наследования


public class TestInterface implements IAuth{

    static boolean isUserLoggedIn = false;

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        if (!isUserLoggedIn)
            testInterface.login();
    }
    @Override
    public void login() {
        isUserLoggedIn = true;
        System.out.println("user logged in");
    }

    @Override
    public void logout() {
        isUserLoggedIn = false;
        System.out.println("user logged out");
    }
}

interface IAuth{

    void login();

    void logout();

}
















        /*extends  Bird {




    @Override
    void walk() {
        super.walk();
    }
}



class Bird {


  final   void fly(){


    }
    void  walk(){



    }*/


