package com.stulsoft;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest1 extends JFrame {
    public FlowLayoutTest1() throws HeadlessException {
        super("FlowLayout");

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
//        setLayout(new FlowLayout(FlowLayout.RIGHT));
//        setLayout(new FlowLayout(FlowLayout.CENTER));
//        setLayout(new FlowLayout(FlowLayout.LEADING));
//        setLayout(new FlowLayout(FlowLayout.TRAILING));
        add(new JLabel("Label 1"));
        add(new JLabel("Label 2"));
        add(new JLabel("Label 3"));

        pack();
        System.out.println(getLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutTest1();
    }
}
