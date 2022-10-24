package com.example.lib;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;

public class Lesson12_2 {


    static Consumer<String> printUpperCase = str ->{
        System.out.print(str.toUpperCase() + " ");


    };
     public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Aryna"));
        persons.add(new Person("Olya"));
        persons.add(new Person("Sasha"));
        persons.add(new Person("Pasha"));
        persons.add(new Person("Dima"));

        for (Person person : persons) {
            System.out.println(person.getName());

            System.out.println(persons);


//            persons.stream().map(Person::getName).forEach((n)->{
//
//                System.out.print(n + " ");
//
//            });

       //     System.out::print + " "

            persons.stream().map(Person::getName).forEach(printUpperCase);





        }
    }

}

    class Person{
        private String name;

        public Person(String name) {
            this.name = name;

        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return  name;
        }


    }


