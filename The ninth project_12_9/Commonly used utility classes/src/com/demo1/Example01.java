package com.demo1;
import javax.swing.*;
import java.awt.*;

public class Example01 {
    public static void main(String[] args) {
        JFrame window1 = new JFrame("张三的第一个窗口");
        JFrame window2 = new JFrame("张三的第二个窗口");
        window1.setVisible(true);
        Container con1 = window1.getContentPane();
        con1.setBackground(Color.cyan);
        window1.setBounds(200,100,500,300);
        window1.setResizable(false);
        window1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        window2.setVisible(true);
        Container con2 = window2.getContentPane();
        con2.setBackground(Color.pink);
        window2.setBounds(200,500,500,300);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
