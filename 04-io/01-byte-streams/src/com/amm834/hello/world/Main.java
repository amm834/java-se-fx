package com.amm834.hello.world;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File inputFile = new File("d:/tmp/sm-2.jpg");
        File outputFile = new File("d:/tmp/output.txt");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(inputFile);
            fileOutputStream = new FileOutputStream(outputFile);
            int code;
            int i = 0;
            while ((code = fileInputStream.read()) != -1) {
                fileOutputStream.write(code);
                i++;
            }
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
