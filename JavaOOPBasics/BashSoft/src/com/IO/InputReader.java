package com.IO;

import com.commandInterpreter.CommandInterpreter;
import com.statics.ExceptionMessages;
import com.statics.SessionData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {
    private static final String END_COMAND = "quit";

    private static OutputWriter outputWriter = new OutputWriter();



    public static void readCommands() throws InterruptedException {
        outputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));

        Scanner reader = new Scanner(System.in);
        String input =reader.nextLine().trim();


        while(!input.equals(END_COMAND)){
            CommandInterpreter.interpretCommand(input);
            outputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));

            input = reader.nextLine().trim();
        }

        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);
        for (Thread thread : threads){
            if (!thread.getName().equals("main") && !thread.isDaemon()){
                thread.join();
            }
        }

    }




}
