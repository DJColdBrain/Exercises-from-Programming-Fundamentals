package com.company;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();
        double thirdDouble = scanner.nextDouble();

        double sum = firstDouble + secondDouble + thirdDouble;
        double avr = sum /3;
        System.out.printf("%.2f",avr);
    }
}
