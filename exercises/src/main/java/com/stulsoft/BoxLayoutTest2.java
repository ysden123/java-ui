package com.stulsoft;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest2 extends JFrame {
    public BoxLayoutTest2() throws HeadlessException {
        super("BoxLayout 2");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Label 1"));
        add(new JLabel("Label 2"));
        add(new JLabel("Label 3"));

        pack();
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest2();
    }
}
