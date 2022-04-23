package com.stulsoft.java.ui.pswing;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AppForm1 extends JFrame {
    private JPanel panelMain;
    private JTextField textField;
    private JButton buttonSubmit;

    public AppForm1() {
        buttonSubmit
                .addActionListener(e -> showMessage());

        buttonSubmit.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    showMessage();
                }
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    showMessage();
                }
            }
        });
    }

    private void showMessage() {
        JOptionPane.showMessageDialog(panelMain,
                textField.getText() + " handled!");
    }

    public static void main(String[] args) {
        var frame = new AppForm1();
        frame.setContentPane(frame.panelMain);
        frame.setTitle("AppForm1 (demo)");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
