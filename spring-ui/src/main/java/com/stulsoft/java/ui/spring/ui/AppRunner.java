package com.stulsoft.java.ui.spring.ui;

import com.stulsoft.java.ui.spring.ui.form.Form1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;

//@Component
public class AppRunner implements ApplicationRunner {
    private static Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("==>run");
        var form1Frame = new Form1();
        form1Frame.setContentPane(form1Frame.panelForm1);
        form1Frame.setTitle("Form1 (demo)");
        form1Frame.setSize(400, 400);
        form1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        form1Frame.setVisible(true);
    }
}
