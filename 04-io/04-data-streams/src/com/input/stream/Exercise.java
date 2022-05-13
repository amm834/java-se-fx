package com.input.stream;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        var products = new String[]{"T Shirt", "Java Key Chain", "Java Cup"};
        var prices = new int[]{1000, 2000, 3000};

        try {
            var output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d:/tmp/some")));

            for (int i = 0; i < products.length; i++) {
                output.writeUTF(products[i]);
                output.writeInt(prices[i]);
            }


            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        var input = new DataInputStream(new BufferedInputStream(new FileInputStream("d:/tmp/some")));
        for (int price : prices) {
            System.out.println(input.readUTF() + " - " + input.readInt());
        }
        input.close();
    }
}
