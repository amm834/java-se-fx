package com.input.stream;

import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("d:/tmp/data")));

            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readBoolean());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }
}
