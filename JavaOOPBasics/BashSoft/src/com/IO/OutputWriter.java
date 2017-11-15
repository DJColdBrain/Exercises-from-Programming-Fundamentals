package com.IO;

import java.util.List;

public class OutputWriter {
    public void writeMessage(String message){
        System.out.print(message);
    }
    public void writeMessageOnNewLine(String message){
        System.out.println(message);
    }
    public void writeEmptyLine(){
        System.out.println();
    }
    public void displayExeption(String message){
        System.out.println(message);
    }
    public void printStudent(String name, List<Integer> marks ){
        String output = String.format("%s - %s", name, marks.toString());
        writeMessageOnNewLine(output);
    }

}
