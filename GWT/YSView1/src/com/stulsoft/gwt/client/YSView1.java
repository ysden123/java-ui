/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * @author Yuriy Stul
 */
public class YSView1 implements EntryPoint {
    private final VerticalPanel mainPanel = new VerticalPanel();
    private final Label label1 = new Label("Label 1");
    private final Label label2 = new Label("Label 2");
    private final Label label3 = new Label("Label 3");

    @Override
    public void onModuleLoad() {
        // Center root panel
        mainPanel.setWidth("100%");
        mainPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        mainPanel.add(label1);
        mainPanel.add(label2);
        mainPanel.add(label3);

        RootPanel rootPanel = RootPanel.get();
        rootPanel.add(mainPanel);
    }
}
