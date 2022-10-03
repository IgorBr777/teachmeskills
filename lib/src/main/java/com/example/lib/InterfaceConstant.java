package com.example.lib;

public class InterfaceConstant implements IAuthirization {

    @Override
    public void login(boolean isUserIsLoggedIn) {
        if (isUserIsLoggedIn){
            System.out.println("user is logged in");
        }
        if (!isUserIsLoggedIn){
            System.out.println("user is not logged in");
        }
    }


    public static void main(String[] args) {
        InterfaceConstant interfaceConstant = new  InterfaceConstant();
        interfaceConstant.login(userIsLoggedIn);

    }

}


interface IAuthirization {



    boolean userIsNotLoggedIn = false; // this is constant (can't be changed)
    boolean userIsLoggedIn = true; // this is constant (can't be changed)

    void  login (boolean isUserIsLoggedIn);
}