package com.zetcode;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameIconEx extends JFrame {

    public FrameIconEx() {
        initUI();
    }

    private void initUI() {
        var icon = new ImageIcon("src/resources/logo.png");
        setIconImage(icon.getImage());
        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new FrameIconEx();
            ex.setVisible(true);
        });
    }
}