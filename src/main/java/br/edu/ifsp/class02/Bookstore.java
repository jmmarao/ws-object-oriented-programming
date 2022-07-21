package br.edu.ifsp.class02;

import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = scanner.nextInt();


        if (numberOfBooks <= 0)
            System.out.println("Erro");
        else {
            double criteriaA = 0.25 * numberOfBooks + 7.5;
            double criteriaB = 0.5 * numberOfBooks + 2.5;

            printBestCriteria(criteriaA, criteriaB);
        }
    }

    private static void printBestCriteria(double criteriaA, double criteriaB) {
        if (criteriaA < criteriaB)
            System.out.println("Criterion A");
        else if (criteriaA > criteriaB)
            System.out.println("Criterion B");
        else
            System.out.println("Indifferent");
    }
}
