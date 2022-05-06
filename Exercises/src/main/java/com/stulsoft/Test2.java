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
        mainFrame.setLayout(new GridLayout(0, 2));

        JLabel label1 = new JLabel("Left", JLabel.LEFT);
        JLabel label2 = new JLabel("Right", JLabel.RIGHT);
        JLabel label3 = new JLabel("Left", JLabel.LEFT);

        mainFrame.add(label1);
        mainFrame.add(label2);
        mainFrame.add(label3);

        mainFrame.add(new JLabel("Center", JLabel.CENTER));

        mainFrame.add(new JLabel("Right", JLabel.RIGHT));
        mainFrame.add(new JLabel("Left", JLabel.LEFT));
        
        mainFrame.add(new JLabel("Center", JLabel.CENTER));

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
