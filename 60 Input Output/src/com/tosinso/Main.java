package com.tosinso;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //byte
        //stream
//        byte[] data=new byte[10];
//        System.out.println("Enter data");
//        try {
//            System.in.read(data);
//            System.out.println("You Entered:");
//            for (int i = 0; i < data.length; i++) {
//                System.out.print((char) data[i]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        File file=new File("src/a.txt");

        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            System.out.println( fileInputStream.available());
            int content;
            while ((content=fileInputStream.read())>=0){
                System.out.print((char) content);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1=new File("src/b.txt");

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file1,true);
            String str="Hello Mehdi";
            byte[] byteData=new byte[str.length()];
            for (int i = 0; i < str.length(); i++) {
                byteData[i]=(byte) str.charAt(i);
            }
            fileOutputStream.write(byteData);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
