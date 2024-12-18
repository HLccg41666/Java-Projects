package com.demo2;
import javax.swing.*;
import java.awt.*;

public class Example02 {
    public static void main(String[] args) {
        ComponentInWindow win = new ComponentInWindow();
        win.setBounds(100,100,1000,400);
        win.setTitle("常用组件");
    }
}

class ComponentInWindow extends JFrame {
    JLabel label1, label2, label3, label4, label5, label6, label7;//标签
    JTextField text;
    JButton button;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup group;
    JComboBox<String> comboBox;
    JTextArea area;
    JPasswordField password;
    public ComponentInWindow() {
        init();
        this.getContentPane().setBackground(Color.pink);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        label1 = new JLabel("文本框:");
        add(label1);
        label1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        text = new JTextField(10);
        add(text);
        label2 = new JLabel("按钮:");
        add(label2);
        label2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        button = new JButton("确定");
        add(button);
        button.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label3 = new JLabel("选择框:");
        add(label3);
        label3.setFont(new Font("微软雅黑", Font.BOLD, 20));
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        checkBox3 = new JCheckBox("喜欢篮球");
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        checkBox1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        checkBox2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        checkBox3.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label4 = new JLabel("单选按钮：");
        add(label4);
        label4.setFont(new Font("微软雅黑", Font.BOLD, 20));
        group = new ButtonGroup();
        radioButton1 = new JRadioButton("男");
        radioButton2 = new JRadioButton("女");
        group.add(radioButton1);
        group.add(radioButton2);
        radioButton1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        radioButton2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        add(radioButton1);
        add(radioButton2);
        label5 = new JLabel("下拉列表：");
        add(label5);
        label5.setFont(new Font("微软雅黑", Font.BOLD, 20));
        comboBox = new JComboBox<>();
        comboBox.addItem("音乐天地");
        comboBox.addItem("武术天地");
        comboBox.addItem("象棋乐园");
        add(comboBox);
        comboBox.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label6 = new JLabel("文本区：");
        add(label6);
        label6.setFont(new Font("微软雅黑",Font.BOLD,20));
        area = new JTextArea(4,10);
        add(new JScrollPane(area));
        label7  =new JLabel("密码框：");
        add(label7);
        label7.setFont(new Font("微软雅黑",Font.BOLD,20));
        password = new JPasswordField(10);
        add(password);














    }

}
