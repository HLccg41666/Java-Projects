package com.demo3;

import java.io.FileOutputStream;

public class Example03 {
    public static void main(String[] args) {
        try {
        FileOutputStream ot = new FileOutputStream("fos.txt");
        String str = "欢迎学习IO流";
        //将这个字符串转化为字符数组
        byte[] b = str.getBytes();
            ot.write(b);
            ot.close();
        }catch (Exception e){

        }
    }
}
