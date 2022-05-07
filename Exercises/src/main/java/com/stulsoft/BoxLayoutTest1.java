package com.stulsoft;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest1 extends JFrame {
    public BoxLayoutTest1() throws HeadlessException {
        super("BoxLayout");

        var contentPane = new JPanel();
        contentPane.setLayout(null);

        var panel = new JPanel();
        panel.setBounds(10, 10, 181, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Label 1"));
        panel.add(new JLabel("Label 2"));
        panel.add(new JLabel("Label 3"));
        contentPane.add(panel);

        setContentPane(contentPane);

        pack();
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest1();
    }
}
