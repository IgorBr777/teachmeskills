package com.example.lib;

public class lesson5__1
{
    public static void main(String[] args) {
        Friend friend = new Friend("Igor", 33, "22.06.1989");
        Friend friend2 = new Friend("Zhenya", 32);
        //        friend.age = 33;
//      friend.name = "Igor";
        friend.born();
        friend2.born();

    }
}

class  Friend {

  private   String name;
   private   int age;
    private String birthdate;

    public  Friend (String name2, int age2, String birthdate2){

        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }

    public  Friend (String name2, int age2){

        this.name = name2;
        this.age = age2;
    }

        void  born(){
String congratulations ="";

if (birthdate ==null || birthdate.isEmpty()){

    congratulations = name + " has birthday on:"+ birthdate
            +" "+" he is "+ age+ " years old";
}
else {congratulations = name + " has birthday on:" +birthdate
        +" "+" he is "+ age+ " years old";
}
        System.out.println(congratulations);
    }

}

