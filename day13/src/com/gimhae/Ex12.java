package com.gimhae;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class Student extends JFrame {
    private JLabel l1, l2, l3, l4, l5;
    private JTextField text1, text2, text3, text4, text5;
    private JButton btn1;
    private JTextArea displayArea;
    private ArrayList<String> list = new ArrayList<String>();

    public Student() {
        JFrame f = new JFrame("학생성적 관리 프로그램");

        l1 = new JLabel("학번");
        l1.setBounds(20, 20, 50, 30);

        text1 = new JTextField();
        text1.setBounds(70, 20, 100, 30);

        l2 = new JLabel("이름");
        l2.setBounds(180, 20, 50, 30);

        text2 = new JTextField();
        text2.setBounds(230, 20, 100, 30);

        l3 = new JLabel("국어");
        l3.setBounds(340, 20, 50, 30);

        text3 = new JTextField();
        text3.setBounds(390, 20, 100, 30);

        l4 = new JLabel("영어");
        l4.setBounds(500, 20, 50, 30);

        text4 = new JTextField();
        text4.setBounds(550, 20, 100, 30);

        l5 = new JLabel("수학");
        l5.setBounds(660, 20, 50, 30);

        text5 = new JTextField();
        text5.setBounds(710, 20, 100, 30);

        btn1 = new JButton("입력");
        btn1.setBounds(820, 20, 100, 30);

        displayArea = new JTextArea();
        displayArea.setBounds(20, 60, 900, 400);
        displayArea.setEditable(false);

        f.add(l1);
        f.add(text1);
        f.add(l2);
        f.add(text2);
        f.add(l3);
        f.add(text3);
        f.add(l4);
        f.add(text4);
        f.add(l5);
        f.add(text5);
        f.add(btn1);
        f.add(displayArea);

        f.setSize(1000, 500); // Adjusted size to fit all components
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = text1.getText();
                String name = text2.getText();
                String kr = text3.getText();
                String en = text4.getText();
                String math = text5.getText();

                String studentInfo = "학번: " + number + ", 이름: " + name + ", 국어: " + kr + ", 영어: " + en + ", 수학: " + math;
                list.add(studentInfo);

                // Update the display area with the new student information
                displayArea.append(studentInfo + "\n");

                // Clear the text fields after input
                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
            }
        });
    }
}

public class Ex12 {

    public static void main(String[] args) {
        new Student();
    }
}
