package com.example.lib;

public class Child extends Parent {
    public int age = 12;
    // Полиморфизм

    @Override
    void speak() {
        super.speak();
        System.out.println("I speak loudly");


      //  super.speak();
    }

    public static void main(String[] args) {

        Parent child = new Child();
        Parent parent = new Parent();
child.eye_color = "green";
        System.out.println("eye color of the child: " +child.eye_color);
        System.out.println("eye color of the parent: " +parent.eye_color);
        child.speak();
        //     parent.speak();

    }
    // Перегрузка
void  phoneNumber (int number){

}

    void  phoneNumber (int number, String mobile_operator){



    }


}

class Parent{
protected  String eye_color = "blue";
void  speak(){
    System.out.println("I speak quietly");
}
}

class Uncle {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        System.out.println(parent.eye_color);
        System.out.println(child.eye_color);



    }
}