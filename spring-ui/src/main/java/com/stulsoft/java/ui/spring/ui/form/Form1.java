package com.stulsoft.java.ui.spring.ui.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    public JPanel panelForm1;
    private JButton buttonSubmit;

    public Form1() {
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Demo action");
            }
        });
    }
}
