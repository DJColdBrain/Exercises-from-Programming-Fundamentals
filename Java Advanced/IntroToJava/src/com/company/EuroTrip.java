package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kgBought  = scanner.nextDouble();
        double kgToLeva = 1.20;
        BigDecimal moneyLeva  = new BigDecimal(kgBought* kgToLeva);

        BigDecimal exchangeRate = new BigDecimal("4210500000000" );
        BigDecimal marks = exchangeRate.multiply(moneyLeva);

        System.out.printf("%.2f marks", marks);
    }
}
