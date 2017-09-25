package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProductOfNumbersN_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BigDecimal sum = new BigDecimal(n);
        for (int i = n + 1; i <= m; i++) {
            sum = sum .multiply(new BigDecimal(i));
        }
        System.out.printf("product[%d..%d] = %s",n,m,sum);
    }
}
