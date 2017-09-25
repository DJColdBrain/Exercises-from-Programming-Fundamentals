package com;

import java.io.File;
import java.util.LinkedList;


public class IOManager {
    public static void traverseDirectory(String path){
        LinkedList<File> subFolders = new LinkedList<File>();
        File root = new File(path);

        subFolders.add(root);

        while (subFolders.size() != 0){
            File currentFolder = subFolders.removeFirst();

            if (currentFolder.listFiles() != null){
                for (File file: currentFolder.listFiles()){
                    if (file.isDirectory()){

                    }
                }
            }
            System.out.println(currentFolder.toString());
        }
    }
}
