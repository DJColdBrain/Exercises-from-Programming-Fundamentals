package cells;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static  ComandInterpreter interpreter = new ComandInterpreter();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String command = reader.readLine();
            if (command.equals("BEER IS COMING")){
                break;
            }

            interpreter.interpret(command);

        }


    }
}
