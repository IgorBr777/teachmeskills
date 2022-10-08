package com.example.lib;
//Анонимный  класс

public class Lesson_2 {

    private String privateVar = "Hello";

        String publicVar = "WORLD";
    static String staticVar = "Android";

    public static void main(String[] args) {
        Lesson_2 lesson_2 = new Lesson_2();
        lesson_2.callInnerClass();

    }

    void callInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerAge + " inner class called");
   //     innerClass.callOuterClassVariable();
    }
    void callNestedClass() {
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass.nestedAge + "nested class called");

    }

    class InnerClass {

               int innerAge = 18;

        void callOuterClassVariable() {
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
callInnerClass();
        }

    }

    static class NestedClass {

                  int nestedAge = 18;

        void callOuterClassVariable() {
       //     System.out.println(privateVar);
         //   System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }
}


//static IRepository iRepository = new IRepository() {// anonym class (with help of interface)
//    @Override
//    public void login(String userName, String password) {
//
//        System.out.println("hello");
//
//        //     System.out.println("child hacked the world");
//    }
//
//};
//    static  Anonym anonym = new Anonym() // anonum class
//    {
//
//        @Override
//        void hackNetwork() {
//            super.hackNetwork(); // parent behavior
//        }
//    };
//    public static void main(String[] args) {
//
//
//        iRepository.login("user name","password");
//        anonym.hackNetwork();
//
//    }
//}
//        class Anonym {
//    void hackNetwork() {
//
//        System.out.println(" I hacked the world");
//          }
//}











