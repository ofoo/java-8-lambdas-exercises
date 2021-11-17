package com.insightfullogic.java8.examples.chapter2;

import javax.swing.*;

public class CaptureCompileError {

    private JButton button;

    /**
     * 例2-7 未使用既成事实上的final变量，导致无法通过编译
     */
    public void error() {
        String name = getUserName();
        name = formatUserName(name);
        // Uncommenting this line should cause a compile error:
        // button.addActionListener(event -> System.out.println("hi " + name));
    }

    private String formatUserName(String name) {
        return name.toLowerCase();
    }

    private String getUserName() {
        return "RICHARD";
    }
}
