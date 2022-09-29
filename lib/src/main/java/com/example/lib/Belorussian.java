package com.example.lib;

public class Belorussian extends Human {

    public static void main(String[] args) {

        Belorussian belorus = new Belorussian();
        German german = new German();
        belorus.speakLanguage();
        german.speakLanguage();

    }

    @Override
    void speakLanguage() {
        System.out.println("speak belorussian language");
    }
}
class German extends  Human{


    @Override
    void speakLanguage() {
        System.out.println("speak german language");
    }
}
abstract  class Human {

    abstract  void  speakLanguage();
}