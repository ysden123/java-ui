package com.stulsoft.pswing;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        var frame = new JFrame();
        var formApp = new FormApp();
        frame.setContentPane(formApp.getMainPanel());
        frame.setTitle("FormApp");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
