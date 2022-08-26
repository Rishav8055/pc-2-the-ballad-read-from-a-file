package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        String fileData="src/Main/resources/ballad.txt";
        System.out.println(ballad.readPoemFromAFile("src/Main/resources/ballad.txt"));
    }
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        String response="";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            int poemData;
            while ((poemData=fileInputStream.read())!=-1){
                char data=(char)poemData;
                response=response+data;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        response=response.replaceAll("\r","");
        return response;
    }


}
