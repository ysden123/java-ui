package com.stulsoft.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Collections;

@SpringBootApplication
public class WebDesktopStarterApplication {
    private static final Logger logger = LoggerFactory.getLogger(WebDesktopStarterApplication.class);

    public static void main(String[] args) {
        var app = new SpringApplication(WebDesktopStarterApplication.class);
        // Find 1st free port
        int localPort;
        try (ServerSocket serverSocket = new ServerSocket(0)) {
            localPort = serverSocket.getLocalPort();
        } catch (IOException exception) {
            logger.error("Cannot find free port. {}", exception.getMessage());
            System.exit(1);
            return;
        }

        app.setDefaultProperties(Collections.singletonMap("server.port", localPort));
        app.run(args);
        logger.info("Starting browser...");
        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:" + localPort;
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException exception) {
            logger.error("Cannot start browser. {}", exception.getMessage());
        }
    }
}
