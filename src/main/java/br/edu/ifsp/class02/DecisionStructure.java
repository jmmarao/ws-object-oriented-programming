package br.edu.ifsp.class02;

public class DecisionStructure {
    public static void main(String[] args) {
        int value = -1;

        if (value > 0)
            System.out.println("Positive variable");
        else if (value < 0)
            System.out.println("Negative variable");
        else
            System.out.println("Variable equal to zero");

        value = (value > 0) ? 100 : -100;
        System.out.println("value = " + value);

        int switchValue = switch (value) {
            case 1 -> 1;
            case 2 -> 2;
            default -> value;
        };

    }
}
