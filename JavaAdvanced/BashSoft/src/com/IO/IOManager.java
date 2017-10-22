package com.IO;


import com.statics.ExceptionMessages;
import com.statics.SessionData;

import java.io.File;
import java.util.LinkedList;

public class IOManager {

    private static OutputWriter ow = new OutputWriter();

    public static void traverseDirectory(int depth) {
        LinkedList<File> subFolders = new LinkedList<File>();

        String path = SessionData.currentPath;
        int initialIndentation = path.split("\\\\").length;

        File root = new File(path);

        subFolders.add(root);

        while (subFolders.size() != 0) {
            File currentFolder = subFolders.removeFirst();

            int currentIndentation = currentFolder.toString().split("\\\\").length - initialIndentation;

            if (depth - currentIndentation < 0){
                break;
            }

            ow.writeMessageOnNewLine(currentFolder.toString());

            if (currentFolder.listFiles() != null) {
                for (File file : currentFolder.listFiles()) {
                    if (file.isDirectory()) {
                        subFolders.add(file);
                    } else {
                        int indexOfLastSlash = file.toString().lastIndexOf("\\");
                        for (int i = 0; i < indexOfLastSlash; i++) {
                            ow.writeMessage("-");
                        }
                        ow.writeMessageOnNewLine(file.getName());
                    }
                }

            }
        }
    }

    public static void createDirectoryInCurrentFolder(String name){
        String path = getCurrentDirectoryPath() + "\\" + name;
        File file = new File(path);
        file.mkdir();
    }

    private static String getCurrentDirectoryPath() {
        String currentPath = SessionData.currentPath;
        return currentPath;
    }

    public static void changeCurrentDirRelativePath(String relativePath){
        if (relativePath.equals("..")) {
            //go one directory up
            String currentPath = SessionData.currentPath;
            int indexLastSlash = currentPath.lastIndexOf("\\");
            String newPath = currentPath.substring(0, indexLastSlash);
            SessionData.currentPath = newPath;
        }else {
            //go to a given Directory
            String currentPath= SessionData.currentPath;
            currentPath += "\\" + relativePath;
            changeCurrentDirAbsolute(currentPath);
        }
    }

    public static void changeCurrentDirAbsolute(String absolutePath) {
        File file = new File(absolutePath);
        if (!file.exists()){
            ow.displayExeption(ExceptionMessages.FILE_NOT_FOUND);
            return;
        }
        SessionData.currentPath = absolutePath;
    }


}
