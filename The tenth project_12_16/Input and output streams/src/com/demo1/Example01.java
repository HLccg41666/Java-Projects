package com.demo1;
import java.io.File;

public class Example01 {
    public static void main(String[] args) {
        File fl = new File("C:\\Users\\ALccg4166\\Desktop","a.txt");
        //判断文件是否存在
        if(fl.exists()){
            System.out.println("文件是否存在："+fl.exists());
        }else{
            System.out.println("文件是否存在："+fl.exists());
            //创建文件
            try {
                boolean bl = fl.createNewFile();
                System.out.println("文件是否创建成功："+bl);
            }catch (Exception e){
                System.out.println("文件是否创建成功: flase");
            }
        }
        System.out.println("文件的名称为："+fl.getName());
        System.out.println(" 文件的绝对路径为："+fl.getAbsolutePath());
        System.out.println("文件的父目录为："+fl.getParent());
        if(fl.isFile()){
            System.out.println("是一个文件");
        }else{
            System.out.println("不是一个文件");
        }
        if(fl.isDirectory()){
            System.out.println("是一个目录");
        }else{
            System.out.println("不是一个目录");
        }
        if(fl.canRead()){
            System.out.println("文件可读");
        }else{
            System.out.println("文件不可读");
        }
        if(fl.canWrite()){
            System.out.println("文件可写");
        }else {
            System.out.println("文件不可写");
        }
        //得到文件大小
        System.out.println("文件大小为："+fl.length()+"bytes");
    }
}
