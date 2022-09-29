package com.example.lib;

class  Friend {

  private   String name;
   private   int age;
    private String birthdate;

    public  Friend (String name2, int age2, String birthdate2){

        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }

    void  born(){
String congratulations ="";

if (birthdate ==null || birthdate.isEmpty()){

    congratulations = "no birthday";
}
else {congratulations = name+ "has birthday on:"+birthdate
        +""+" he is"+ age+ " years old";


}
        System.out.println(congratulations);
    }

}

