package com.stulsoft;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Test2 {

    public Test2(){
        init();
    }

    public static void main(String[] args) {
        new Test2();
    }

    private void init(){
        JFrame mainFrame = new JFrame("Test 2");
        mainFrame.setSize(400, 400);
//        mainFrame.setLayout(new GridLayout(2, 2));
        mainFrame.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Label 1", JLabel.CENTER);
        JLabel label2 = new JLabel("Label 2", JLabel.CENTER);
        JLabel label3 = new JLabel("Label 3", JLabel.CENTER);

        mainFrame.add(label1);
        mainFrame.add(label2);
        mainFrame.add(label3);

        mainFrame.add(new JLabel("Label 4", JLabel.CENTER));
        mainFrame.add(new JLabel("Label 5", JLabel.CENTER));

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
