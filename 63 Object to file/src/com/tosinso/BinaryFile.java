package com.tosinso;

import java.io.*;

public class BinaryFile {
    public static void main(String[] args) {
        try {
            DataOutputStream outputStream=new DataOutputStream(new FileOutputStream("binary.dat"));
            outputStream.writeUTF("hello tosinso users");
            outputStream.writeInt(145);
            outputStream.writeBoolean(false);
            outputStream.writeFloat(3.141516f);
            outputStream.writeDouble(156156.321);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream inputStream=new DataInputStream(new FileInputStream("binary.dat"));
            String string=inputStream.readUTF();
            System.out.println(string);
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
