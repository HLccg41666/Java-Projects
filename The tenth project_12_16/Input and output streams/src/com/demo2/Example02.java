package com.demo2;

import java.io.FileInputStream;

public class Example02 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("fis.txt");
            while (true) {
                int i = in.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
            in.close();
        }catch (Exception e){

        }
    }
}

