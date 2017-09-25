package com;

import java.util.Scanner;

import static com.IOManager.traverseDirectory;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        traverseDirectory(path);
    }
}
