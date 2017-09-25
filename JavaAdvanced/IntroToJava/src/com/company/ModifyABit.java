package com.company;

import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  =scanner.nextInt();
        int p = scanner.nextInt();
        int v = scanner.nextInt();
        int result = 0;
        if (v ==0) {
            int mask = ~(1 << p);
            result = mask & n;
        }else{
            int mask = 1<<p;
            result = mask | n;
        }

        System.out.println(result);
    }
}
