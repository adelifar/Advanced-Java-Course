package com.tosinso;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        File file=new File("src/a.txt");

//        try {
//            FileReader reader=new FileReader(file);
//            BufferedReader bReader=new BufferedReader(reader);
//            String line=null;
//            while ((line=bReader.readLine())!=null){
//                System.out.println(line);
//            }
//            int content;
//            while ((content=reader.read())>0){
//                System.out.println(content);
////                System.out.print((char)content);
//            }

//            FileInputStream inputStream=new FileInputStream(file);
//            int content;
//            while ((content=inputStream.read())>0){
////                System.out.println(content);
//                System.out.print((char)content);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            InputStreamReader reader=new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
//            int content;
//            while ((content=reader.read())>0){
////                System.out.println(content);
//                System.out.print((char)content);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            PrintWriter writer=new PrintWriter(file,"UTF-8");
            writer.append("این متنی است که از طرف برنامه نوشته شده است");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines=Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
            for (String str :
                    lines) {
                System.out.println(str);
            }

            String fileContent=new String(Files.readAllBytes(file.toPath()),StandardCharsets.UTF_8);
            System.out.println("fileContent = " + fileContent);

            Stream<String> largeFileContent=Files.lines(file.toPath(),StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
