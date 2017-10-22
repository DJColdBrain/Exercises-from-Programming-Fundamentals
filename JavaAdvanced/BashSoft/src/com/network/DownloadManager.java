package com.network;

import com.IO.OutputWriter;
import com.statics.ExceptionMessages;
import com.statics.SessionData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadManager {

    private static OutputWriter outputWriter = new OutputWriter();

    public static void download(String fileUrl){

        URL url = null;
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;

        try {
            outputWriter.writeMessageOnNewLine("Starting downloading..");

            url = new URL(fileUrl);
            rbc = Channels.newChannel(url.openStream());
            String fileName  = extractNameOfFile(url.toString());
            File file = new File(SessionData.currentPath + "/" + fileName);
            fos = new FileOutputStream(file);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

            outputWriter.writeMessageOnNewLine("Download complete..");
        }catch (MalformedURLException e){
            outputWriter.displayExeption(e.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fos != null){
                    fos.close();
                }if (rbc != null){
                    rbc.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }

    public static void  downloadOnNewThread(String fileUrl){
        Thread thread = new Thread(() -> download(fileUrl));
        thread.setDaemon(false);
        thread.start();
    }

    private static String extractNameOfFile(String fileUrl) throws MalformedURLException {
        int indexOfLastSlash = fileUrl.lastIndexOf("/");
        if (indexOfLastSlash == -1){
            throw new MalformedURLException(ExceptionMessages.INVALID_PATH);
        }
        return fileUrl.substring(indexOfLastSlash +1 );
    }
}
