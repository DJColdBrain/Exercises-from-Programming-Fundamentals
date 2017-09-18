package com.company;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next("\\w+");
        String secondString = scanner.next("\\w+");
        Integer firstInt = scanner.nextInt();
        Integer secondInt = scanner.nextInt();
        Integer thirdInt = scanner.nextInt();
        String thirdString = scanner.next("\\w+");
        scanner.nextLine();

        Integer sum = firstInt + secondInt + thirdInt;

        System.out.printf("%s %s %s %d",firstString, secondString, thirdString, sum);
    }
}
