package com;


import java.io.File;
import java.util.LinkedList;

public class IOManager {

    OutputWriter ow = new OutputWriter();

    public void traverseDirectory(String path) {
        LinkedList<File> subFolders = new LinkedList<File>();
        File root = new File(path);

        subFolders.add(root);

        while (subFolders.size() != 0) {
            File currentFolder = subFolders.removeFirst();

            if (currentFolder.listFiles() != null) {
                for (File file : currentFolder.listFiles()) {
                    if (file.isDirectory()) {
                        ow.writeMessageOnNewLine("Dir: " + file.getAbsolutePath());
                        traverseDirectory(file.getPath());
                    } else {
                        ow.writeMessageOnNewLine("  --> File:  " + file.getAbsolutePath());
                    }
                }

            }
        }
    }

}
