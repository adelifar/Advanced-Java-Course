package com.tosinso;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file=new File("src/com/tosinso/a.txt");
        try {
            FileWriter fileWriter=new FileWriter(file,true);
            fileWriter.write("Hello tosinso users and Java Programmers\r\n");
            fileWriter.close();
            FileReader reader=new FileReader(file);
            int content;
            while ((content=reader.read())>=0){
                System.out.print((char)content);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Using Buffered Reader");
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedWriter bWriter=new BufferedWriter(new FileWriter(file,true));
            bWriter.write("This is a text writed from Buffered Writer");
            bWriter.newLine();
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.err.println("with scanner");
        try {
            Scanner scanner=new Scanner(new FileInputStream(file));
            while (scanner.hasNext()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.err.println("with printStream");
        try {
            PrintStream printStream=new PrintStream(new FileOutputStream(file,true));
            printStream.println("Hello this text is from printStream");
            printStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
