package com;


public class Main {
    public static void main(String[] args) {

        IOManager ioManager = new IOManager();
        String path = "C:";

        ioManager.traverseDirectory(path);
    }
}
