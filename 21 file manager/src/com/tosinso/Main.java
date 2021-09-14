package com.tosinso;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //c:\windows\system\a.txt
        // /home/user/Downloads/a.txt
        Path p= Paths.get("C:","Users","mehdi","Desktop","test");
        System.out.println(p);
        Path q=Paths.get("src");
        System.out.println( p.getParent());
        System.out.println(p.getRoot());
        System.out.println(p.getFileName());
        System.out.println(p.toAbsolutePath());
        System.out.println(q.toAbsolutePath());
        q=Paths.get("testDir");
        System.out.println(q.toAbsolutePath());
        Path filePath=q.resolve("test.iml");
        System.out.println(filePath);
        System.out.println(filePath.resolveSibling("test2.iml"));
        System.out.println(q.resolveSibling("test2.iml").toAbsolutePath());
        Path srcPath=Paths.get("src");
        System.out.println(q.relativize(srcPath));
        Path cmp=Paths.get(q.toString(), q.relativize(srcPath).toString());
        System.out.println(cmp.toAbsolutePath().normalize());


        try {
            byte[] bytes=Files.readAllBytes(filePath);

            String content=new String(bytes, Charset.forName("UTF-8"));

            List<String> lines=Files.readAllLines(filePath);
            System.out.println(lines.size());
            System.out.println(content);

            Files.write(filePath.resolveSibling("testToWrite.txt"),"mehdi adei".getBytes("UTF-8"));
            Files.write(filePath.resolveSibling("testToWrite.txt"),"Tosinso website".getBytes("UTF-8"), StandardOpenOption.APPEND);

//
//           Files.write(filePath,lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            Files.createDirectory(Paths.get("src/mehdiDir/someDir"));
            Files.createDirectories(Paths.get("src/mehdiDir/someDir"));
//            Files.createFile(Paths.get("src/mehdiDir/someDir/test.txt"));

            Files.createTempDirectory("jjjj");
            Files.createTempFile("iiii","rrrrrrrrrr");

            Files.copy(Paths.get("testDir/test.iml"),Paths.get("src/someDir/ttt.iml"), StandardCopyOption.REPLACE_EXISTING);

            Files.move(Paths.get("src/someDir/ttt.iml"),Paths.get("testDir/test55.iml"),StandardCopyOption.ATOMIC_MOVE);

//Files.delete(Paths.get("someDir"));
Files.deleteIfExists(Paths.get("someDir"));
Files.deleteIfExists(Paths.get("src/someDir"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
