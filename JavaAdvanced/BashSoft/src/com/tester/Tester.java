package com.tester;

import com.IO.OutputWriter;
import com.statics.ExceptionMessages;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    private static OutputWriter outputWriter = new OutputWriter();



    public static void compareContent(String actualOutput, String expectedOutput){
        outputWriter.writeMessageOnNewLine("Reading files...");
        String mismatchedPath = getMismatchedPath(expectedOutput);

        List<String> actualOutputString = readTextFile(actualOutput);
        List<String> expectedOutputString = readTextFile(expectedOutput);

        boolean mismatch = compareString(actualOutputString, expectedOutputString,  mismatchedPath);

        if (mismatch){
            List<String> mismatchString = readTextFile(mismatchedPath);
            mismatchString.stream().forEach(outputWriter::writeMessageOnNewLine);
        }else{
            outputWriter.writeMessageOnNewLine("Files are identical. There are no mismatches.");
        }

    }

    private static boolean compareString(List<String> actualOutputString, List<String> expectedOutputString, String mismatchedPath) {
        outputWriter.writeMessageOnNewLine("Comparing files...");
        String output;

        boolean isMismatch = false;

            try (FileWriter fileWriter = new FileWriter(mismatchedPath);BufferedWriter writer = new BufferedWriter(fileWriter)){



                for (int i = 0; i < expectedOutputString.size(); i++) {
                    String actualLine = actualOutputString.get(i);
                    String expectedLine = expectedOutputString.get(i);

                    if (!actualLine.equals(expectedLine)){
                        output = String.format("mismatch -> expected(%s), actual(%s)%n",expectedLine, actualLine);
                        isMismatch = true;
                    }else{
                        output = String.format("line match -> %s%n", actualLine);
                    }
                    writer.write(output);
                }
               writer.close();
              //  fileWriter.close();
                
            }catch (Exception e){
                outputWriter.displayExeption("ERROR Could not compare the file");
            }


        return  isMismatch;
    }

    private static List<String> readTextFile(String filePath) {
        List<String> text = new ArrayList<>();
            File file = new File(filePath);

        try (FileReader fileReader = new FileReader(file);BufferedReader bufferedReader = new BufferedReader(fileReader)){



            String line = bufferedReader.readLine();

            while (line != null){
                text.add(line);
                line = bufferedReader.readLine();
            }
        }catch (Exception e){
            outputWriter.displayExeption(ExceptionMessages.FILE_NOT_FOUND);
        }
        return text;
    }

    private static String getMismatchedPath(String expectedOutput){
        int index = expectedOutput.lastIndexOf('\\');
        String directoryPath = expectedOutput.substring(0, index);
        return directoryPath + "\\mismatch.txt";
    }
}
