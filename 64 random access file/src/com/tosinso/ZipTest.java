package com.tosinso;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest {
    public static void main(String[] args) {
        try {
            ZipOutputStream zout=new ZipOutputStream(new FileOutputStream("test.zip"));
            zout.setLevel(9);
            ZipEntry file1=new ZipEntry("1.txt");
            ZipEntry file2=new ZipEntry("2.txt");
            ZipEntry file3=new ZipEntry("randomAccess.dat");

            zout.putNextEntry(file1);
            zout.write(Files.readAllBytes(Paths.get(file1.getName())));
            zout.closeEntry();

            zout.putNextEntry(file2);
            zout.write(Files.readAllBytes(Paths.get(file2.getName())));
            zout.closeEntry();

            zout.putNextEntry(file3);
            zout.write(Files.readAllBytes(Paths.get(file3.getName())));
            zout.closeEntry();

            zout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ZipInputStream zin=new ZipInputStream(new FileInputStream("test.zip"));
            ZipEntry entry;
            while ((entry=zin.getNextEntry())!=null){
                System.out.println(entry.getName());
                System.out.println(entry.getSize());
                System.out.println(entry.getCreationTime());
                ZipFile zipFile=new ZipFile("test.zip");
                InputStream inputStream=zipFile.getInputStream(entry);
                int data;
                while ((data=inputStream.read())>= 0){
                    System.out.print((char) data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
