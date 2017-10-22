package com.commandInterpreter;

import com.IO.IOManager;
import com.IO.OutputWriter;
import com.dataStructures.StudentsRepository;
import com.network.DownloadManager;
import com.statics.ExceptionMessages;
import com.statics.SessionData;
import com.tester.Tester;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CommandInterpreter {

     private static OutputWriter outputWriter = new OutputWriter();

    public static void interpretCommand(String input){
        String[] data = input.split("\\s+");
        String command = data[0];
        switch (command){
            case "open":
                tryOpenFile(input, data);
                break;
            case "mkdir":
                tryMakeDirectory(input , data);
                break;
            case "ls":
                tryTraverseFolders(input, data);
                break;
            case "cmp":
                tryCompareFiles(input, data);
                break;
            case "changeDirRel":
                tryChangeRelativePath(input, data);
                break;
            case "changeDirAbs":
                tryChangeAbsolutePath(input, data);
                break;
            case "readDb":
                tryReadDatabaseFromFile(input, data);
                break;
            case "filter":
                tryPrintFilteredStudents(input, data);
                break;
            case "order":
                tryPrintOrderedStudents(input, data);
                break;
            case "download":
                tryDownloadFile(input, data);
                break;
            case "downloadAsynch":
                tryDownloadFileOnNewThread(input, data);
                break;
            case "help":
                tryGetHelp();
                break;
            case "show":
                tryShowWantedCourse(input, data);
                break;
                default:
                    displayInvalidCommandMessage(input);
                    break;
        }
    }

    private static void tryDownloadFileOnNewThread(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }

        String fileUlr = data[1];
        DownloadManager.downloadOnNewThread(fileUlr);
    }

    private static void tryDownloadFile(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }

        String fileUlr = data[1];
        DownloadManager.download(fileUlr);
    }

    private static void tryPrintFilteredStudents(String input, String[] data) {
        if (data.length != 3 && data.length != 4){
            displayInvalidCommandMessage(input);
            return;
        }
        String course = data[1];
        String filter = data[2];

        if (data.length == 3){
            StudentsRepository.printFilteredStudents(course, filter, null);
        }

        Integer numberOfStudents = Integer.parseInt(data[3]);

        if (data.length == 4){
            StudentsRepository.printFilteredStudents(course, filter, numberOfStudents);
        }
    }

    private static void tryPrintOrderedStudents(String input, String[] data) {
        if (data.length != 3 && data.length != 4){
            displayInvalidCommandMessage(input);
            return;
        }
        String course = data[1];
        String order = data[2];

        if (data.length == 3){
            StudentsRepository.printOrderedStudents(course, order, null);
        }

        Integer numberOfStudents = Integer.parseInt(data[3]);

        if (data.length == 4){
            StudentsRepository.printOrderedStudents(course, order, numberOfStudents);
        }
    }


    private static void tryShowWantedCourse(String input, String[] data) {
        if (data.length!= 2 && data.length != 3){
            displayInvalidCommandMessage(input);
            return;
        }

        if (data.length == 2){
            String courseName = data[1];
            StudentsRepository.getStudentsByCourse(courseName);
        }
        if (data.length == 3){
            String courseName = data[1];
            String studentName = data[2];
            StudentsRepository.getStudentMarksInCourse(courseName, studentName);
        }
    }

    private static void tryMakeDirectory(String input, String[] data) {
        if (data.length!= 2){
            displayInvalidCommandMessage(input);
            return;
        }
        String folderName = data[1];
        IOManager.createDirectoryInCurrentFolder(folderName);
    }

    private static void tryGetHelp() {
        outputWriter.writeMessageOnNewLine("mkdir path - make directory");
        outputWriter.writeMessageOnNewLine("ls depth - traverse directory");
        outputWriter.writeMessageOnNewLine("cmp path1 path2 - compare two files");
        outputWriter.writeMessageOnNewLine("changeDirRel relativePath - change directory");
        outputWriter.writeMessageOnNewLine("changeDir absolutePath - change directory");
        outputWriter.writeMessageOnNewLine("readDb path - read students data base");
        outputWriter.writeMessageOnNewLine("filterExcelent - filter excelent students (the output is written on the console)");
        outputWriter.writeMessageOnNewLine("filterExcelent path - filter excelent students (the output is written in a given path)");
        outputWriter.writeMessageOnNewLine("filterAverage - filter average students (the output is written on the console)");
        outputWriter.writeMessageOnNewLine("filterAverage path - filter average students (the output is written in a file)");
        outputWriter.writeMessageOnNewLine("filterPoor - filter low grade students (the output is on the console)");
        outputWriter.writeMessageOnNewLine("filterPoor path - filter low grade students (the output is written in a file)");
        outputWriter.writeMessageOnNewLine("order - sort students in increasing order (the output is written on the console)");
        outputWriter.writeMessageOnNewLine("order path - sort students in increasing order (the output is written in a given path)");
        outputWriter.writeMessageOnNewLine("decOrder - sort students in decreasing order (the output is written on the console)");
        outputWriter.writeMessageOnNewLine("decOrder path - sort students in decreasing order (the output is written in a given path)");
        outputWriter.writeMessageOnNewLine("download pathOfFile - download file (saved in current directory)");
        outputWriter.writeMessageOnNewLine("downloadAsync path - download file asynchronously (save in the current directory)");
        outputWriter.writeMessageOnNewLine("help - get help");
        outputWriter.writeEmptyLine();
    }

    private static void tryReadDatabaseFromFile(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }
        String fileName = data[1];
        StudentsRepository.initializeData(fileName);
    }

    private static void tryChangeAbsolutePath(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }
        String absolutePath = data[1];
        IOManager.changeCurrentDirAbsolute(absolutePath);
    }

    private static void tryChangeRelativePath(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }
        String relativePath = data[1];
        IOManager.changeCurrentDirRelativePath(relativePath);
    }

    private static void tryCompareFiles(String input, String[] data) {
        if (data.length != 3){
            displayInvalidCommandMessage(input);
            return;
        }
        String firstPath = data[1];
        String secondPath = data[2];
        Tester.compareContent(firstPath, secondPath);
    }

    private static void tryTraverseFolders(String input, String[] data) {
        if (data.length != 1 && data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }
        if (data.length == 1){
            IOManager.traverseDirectory(0);
        }
        if (data.length == 2){
            int length = -1;
            try {
                length = Integer.parseInt(data[1]);
            }catch (Exception e){
                displayInvalidCommandMessage(input);
            }
            IOManager.traverseDirectory(length);
        }
    }

    private static void displayInvalidCommandMessage(String input) {
        outputWriter.displayExeption("The command " + input + " is invalid!");
    }

    private static void tryOpenFile(String input, String[] data) {
        if (data.length != 2){
            displayInvalidCommandMessage(input);
            return;
        }
        String fileName = data[1];
        String filePath = SessionData.currentPath+"\\"+fileName;
        File file = new File( filePath);
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            outputWriter.displayExeption(ExceptionMessages.COULD_NOT_OPEN_FILE);
        }
    }
}
