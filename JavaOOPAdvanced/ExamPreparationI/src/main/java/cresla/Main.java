package cresla;

import cresla.entities.io.ConsoleReader;
import cresla.entities.io.ConsoleWriter;
import cresla.entities.io.ManagerImpl;
import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OutputWriter outputWriter = new ConsoleWriter();
        InputReader inputReader = new ConsoleReader();
        Manager manager = new ManagerImpl();

        whileLoop:
        while (true){
            List<String> commandTokens = Arrays.asList(inputReader.readLine().split(" "));

            switch (commandTokens.get(0)){
                case "Reactor":
                    outputWriter.write(manager.reactorCommand(commandTokens));
                    break ;
                case "Module":
                    outputWriter.write(manager.moduleCommand(commandTokens));
                    break ;
                case "Report":
                    outputWriter.write(manager.reportCommand(commandTokens));
                    break ;
                    default:
                        outputWriter.write(manager.exitCommand(commandTokens));
                        break whileLoop;

            }
        }
    }
}
