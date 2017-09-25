package com.company;

public class Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <=8; i++) {
            for (int j = i+1; j <= 9;j++) {
                for (int h = j+ 1; h <= 10; h++) {
                    System.out.printf("%d %d %d%n",i, j, h);
                }
            }
        }
    }
}
