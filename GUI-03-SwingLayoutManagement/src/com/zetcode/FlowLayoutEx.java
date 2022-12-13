package com.zetcode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

public class FlowLayoutEx extends JFrame {

    public FlowLayoutEx() {

        initUI();
    }

    private void initUI() {

        var panel = new JPanel(new FlowLayout(10));

        var button = new JButton("button");
        panel.add(button);

        var tree = new JTree();
        panel.add(tree);

        var area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));

        panel.add(area);

        add(panel);

        pack();

        setTitle("FlowLayout example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var ex = new FlowLayoutEx();
            ex.setVisible(true);
        });
    }
}