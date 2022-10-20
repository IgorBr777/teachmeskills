package com.example.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Lesson11_4 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Sasha");
        arrayList.add("Dima");
        arrayList.add("Olya");
        arrayList.add("Sasha");
        arrayList.add("Masha");

        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.print(arrayList);
        System.out.println();

        Collections.sort(arrayList, Comparator.<String>reverseOrder());
        System.out.print(arrayList);







//        ArrayList<Person> arrayList = new ArrayList<Person>();
//
//        arrayList.add(new Person("Sasha", 18));
//        arrayList.add(new Person("Dima", 10));
//        arrayList.add(new Person("Olya",21 ));
//        arrayList.add(new Person("Sasha",32));
//        arrayList.add(new Person("Masha",25));
//
//
//        System.out.println(arrayList);
//        Collections.sort(arrayList, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return Integer.valueOf(person.getAge()).compareTo(Integer.valueOf(t1.getAge())
//                );
//            }
//        });
//
//        for (Person person :arrayList){
//            System.out.println(person.getAge());
//
//
//
//
//
//
//
//        }




    }
}

class  Person{

private String  name;
private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}







//    ArrayList<String> arrayList = new ArrayList<String>();
//
//        arrayList.add("one");
//                arrayList.add("two");
//                arrayList.add("tree");
//                arrayList.add("four");
//                arrayList.add("five");
//
//                int index = arrayList.indexOf("two");
//
//                arrayList.remove("two");
//                System.out.println(arrayList);













//        Iterator iterator = arrayList.iterator();
//while (iterator.hasNext()){
//    System.out.print(iterator.next());












