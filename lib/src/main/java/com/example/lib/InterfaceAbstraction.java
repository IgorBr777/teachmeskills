package com.example.lib;

public class InterfaceAbstraction {

}

abstract class Bird {

    abstract  void walk();
}
interface IFlyingBird{
    void fly();
}

class Crown extends Bird implements IFlyingBird  {

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
class Papuqai extends Bird implements IFlyingBird {

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
 class Penguin extends Bird implements IFlyingBird {

    @Override
    void walk() {

    }

     @Override
     public void fly() {

     }
 }

