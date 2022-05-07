package com.stulsoft;

import javax.swing.*;
import java.awt.*;

public class ResponseConverter  extends JFrame {
    public ResponseConverter() throws HeadlessException {
        super("Response converter");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Original response:", JLabel.LEFT));
        var originalResponse = new JTextArea(30, 300);
//        originalResponse.setAutoscrolls(true);
//        originalResponse.setMaximumSize(new Dimension(300, 30));
//        originalResponse.setPreferredSize(new Dimension(300, 30));
//        originalResponse.setBounds(5,5, 300, 30);
//        originalResponse.setLocation(5,5);
//        originalResponse.setLineWrap(false);
        var originalResponseScrollPane = new JScrollPane(originalResponse);
        originalResponseScrollPane.setMinimumSize(new Dimension(300, 30));
        originalResponseScrollPane.setMaximumSize(new Dimension(300, 30));
        add(originalResponseScrollPane);

        pack();
        setSize(320, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ResponseConverter();
    }
}
