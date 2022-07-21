package br.edu.ifsp.class02;

import java.util.Scanner;

public class BasicCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        String width = scanner.nextLine();

        System.out.print("Length: ");
        String length = scanner.nextLine();

        float widthValue = Float.parseFloat(width);
        float lengthValue = Float.parseFloat(length);

        System.out.printf("\nArea: %.2f x %.2f = %.2f", widthValue, lengthValue, widthValue * lengthValue);
    }
}
