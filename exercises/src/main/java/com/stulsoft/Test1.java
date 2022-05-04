package com.stulsoft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Test1 {
    private JFrame mainFrame;

    private JPanel controlPanel;

    private JButton okButton;
    private JButton cancelButton;
    private JLabel statusLabel;

    public Test1() {
        init();
    }

    public static void main(String[] args) {
        new Test1();
    }

    private void init() {
        mainFrame = new JFrame("Test 1");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(2, 1));

        controlPanel = new JPanel();
        mainFrame.add(controlPanel);
        controlPanel.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(new ButtonClickerListener());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ButtonClickerListener());
        controlPanel.add(okButton);
        controlPanel.add(cancelButton);

        statusLabel = new JLabel("", JLabel.CENTER);
        mainFrame.add(statusLabel);

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    private class ButtonClickerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "OK":
                    statusLabel.setText("OK button clicked");
                    break;
                case "Cancel":
                    statusLabel.setText("Cancel button clicked");
                    break;
            }
        }
    }
}
