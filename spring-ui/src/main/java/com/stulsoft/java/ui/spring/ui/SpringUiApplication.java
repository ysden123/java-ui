package com.stulsoft.java.ui.spring.ui;

import com.stulsoft.java.ui.spring.ui.form.Form1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class SpringUiApplication extends JFrame {

    private static final Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    private Form1 frame;

    public SpringUiApplication() throws HeadlessException {
        initUI();
    }

    private void setVisible(){
        frame.setVisible(true);
    }
    private void initUI() {
        frame = new Form1();
        frame.setContentPane(frame.panelForm1);
        frame.setTitle("Form1 (demo)");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        logger.info("==>main");
        var ctx = new SpringApplicationBuilder(SpringUiApplication.class)
                .headless(false).run(args);

        EventQueue.invokeLater(()->{
            var ex= ctx.getBean(SpringUiApplication.class);
            ex.setVisible();
        });
    }

}
