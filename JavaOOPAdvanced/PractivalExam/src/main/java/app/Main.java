package app;

import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;
import app.core.GameEngine;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        Engine engine = new GameEngine(writer, reader);

        engine.run();

    }
}
