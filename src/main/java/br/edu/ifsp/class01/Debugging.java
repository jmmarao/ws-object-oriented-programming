package br.edu.ifsp.class01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        List<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Student name (or ENTER to exit): ");

        do {
            newStudent = in.nextLine();
            if (!newStudent.equals(""))
                students.add(newStudent);
        } while (!newStudent.equals(""));

        System.out.println("-------------");
        for (String student : students) {
            System.out.print("Student [" + student + "] grade: ");
            grades.add(in.nextDouble());
        }

        System.out.println("-------------");
        System.out.println("Classroom grade: ");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " | " + grades.get(i));
            sum += grades.get(i);
        }

        double average = sum / students.size();
        System.out.println("-------------");
        System.out.printf("Classroom average: %.2f", average);
    }
}
