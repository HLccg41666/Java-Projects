package com.dome1;

public class StringClassDome {
    public static void main(String[] args) {
        String mess = "姓名:张三 ,出生时间:1989年10月16日。个人网站:http://www.zhang.com。" + "身高: 185cm ,体重: 72kg ";
        //获取第一次出现“：”的索引
        int index = mess.indexOf(":");
        //利用SubString截取字符串
        String name = mess.substring(index + 1);
        //判断截取后的字符串的第一个字符是否为“张”
        if (name.startsWith("张")) {
            System.out.println("简历钟的姓名姓\"张\"");
        }
        //表示从上一个位置即index+1开始寻找第一个出现“：”的索引
        index = mess.indexOf(":", index + 1);
        //截取字符串的日期部分
        String date = mess.substring(index + 1, index + 11);
        System.out.println("出生日期：" + date);
        //表示从上一个位置即index+1开始寻找第一个出现“：”的索引
        index = mess.indexOf(":", index + 1);
        //获取第一次出现“身高”的索引
        int heightPosition = mess.indexOf("身高");
        //截取字符串
        String personWeb = mess.substring(index + 1, heightPosition - 1);
        System.out.println("网址" + personWeb);
        //表示从上一个位置即heightPosition开始寻找第一个出现“：”的索引
        index = mess.indexOf(":", heightPosition);
        int cmPosition = mess.indexOf("cm");
        String height = mess.substring(index + 1, cmPosition);
        //去掉字符串头尾的空格
        height = height.trim();
        //先把字符串类型的数字使用包装类的方法转化成int类型
        int h = Integer.parseInt(height);
        if (h >= 180) {
            System.out.println("简历中的身高" + height + "大于等于180cm");
        } else {
            System.out.println("简历中的身高" + height + "小于180cm");
        }
        index = mess.lastIndexOf(":");
        int kgPosition = mess.indexOf("kg");
        String weight = mess.substring(index + 1, kgPosition);
        //去掉字符串头尾的空格
        weight = weight.trim();
        //先把字符串类型的数字使用包装类的方法转化成int类型
        int w = Integer.parseInt(weight);
        if (w >= 75) {
            System.out.println("简历中的体重" + weight + "大于等于75kg");
        } else {
            System.out.println("简历中的体重" + weight + "小于75kg");
        }
    }
}
