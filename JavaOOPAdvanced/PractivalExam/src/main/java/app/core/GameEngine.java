package app.core;

import app.contracts.Battlefield;
import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;

import java.io.IOException;
import java.util.Arrays;

public class GameEngine implements Engine{

    private Writer writer;
    private Reader reader;



    public GameEngine(Writer writer, Reader reader) throws IOException {
        this.writer = writer;
        this.reader = reader;
    }
    public void run() throws IOException {
        Battlefield battleField = new BattlefieldImplementation(writer);
    String line = reader.readLine();
    while (!line.equalsIgnoreCase("Peace")){
        String[] lineTokens = line.split("\\s+");

        switch (lineTokens[0].toLowerCase()){
            case "createparticipant" :
                battleField.createParticipant(lineTokens[1], lineTokens[2]);
                break;
            case "createaction" :
                battleField.createAction(lineTokens[1],
                        Arrays.copyOf(Arrays.stream(lineTokens).skip(2).toArray(),
                                Arrays.stream(lineTokens).skip(2).toArray().length,
                                String[].class));
                break;
            case "statparticipants":
                battleField.reportParticipants();
                break;
            case "statactions":
                battleField.reportActions();
                break;
            default:
                writer.writeLine("Invalid command");
                break;
        }

        line = reader.readLine();
        }
    }
}
