package com.example.lib;

public class Lesson8 {


    public static void main(String[] args) {
        try {
            getWrongValue(null);
        } catch (ArithmeticException e) {
            System.out.println(" caught Arithmetic ");
        } catch (NullPointerException e) {
            System.out.println(" caught NullPointerException ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" caught IndexOutOfBoundsException ");

        } finally {
            System.out.println(" do if success or exception thrown");
        }

    }

    static void getWrongValue(Integer value) {

        System.out.println(value.toString());
    }

}
