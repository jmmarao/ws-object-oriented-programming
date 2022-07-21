package br.edu.ifsp.class02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DataTypes {
    public static void main(String[] args) {
        final int CONSTANT = 20;

        int i = 10; // 32 bits
        long l = 13L; // 64 bits
        short s = 10; // 16 bits
        byte b = 10; // 8 bits
        float f = 10.1f; // 32 bits
        double d = 10.7; // 64 bits

        System.out.println("Before casting");
        System.out.println("f = " + f/3);
        System.out.println("d = " + d/3);
        System.out.println("l = " + l);
        System.out.println("-------------------");

        f = (float) d; // casting: on this case the precision has decreased because it turned a double (64 bits) into float (32 bits)
        l = (long) d; // casting: on this case the precision has decreased because the number was truncated when turned a double into a long

        System.out.println("After casting");
        System.out.println("f = " + f/3);
        System.out.println("d = " + d/3);
        System.out.println("l = " + l);
        System.out.println("-------------------");

        char character = 'a';
        String string = "string";

        System.out.println("character = " + character);
        System.out.println("-------------------");

        character = 51;
        System.out.println("new character = " + character);
        System.out.println("-------------------");

        character = '\u2328'; // unicode table
        System.out.println("new character = " + character);
        System.out.println("-------------------");

        LocalDate dateNow = LocalDate.now();
        DayOfWeek dayOfWeek = dateNow.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY)
            System.out.println("Let's party!");
        else
            System.out.println("Working time...");
    }
}
