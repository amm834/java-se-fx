package com.amm834.hello.world;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d:/tmp/data")));

            outputStream.writeInt(120);
            outputStream.writeUTF("Hello World");
            outputStream.writeBoolean(false);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
