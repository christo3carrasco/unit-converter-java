package com.carrasco.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private JTabbedPane tabbedPane;
    private FirstView firstView;
    private SecondView secondView;
    private ThirdView thirdView;

    public MainView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Unit converter - Christo");
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BorderLayout());
        setResizable(false);

        firstView = new FirstView();
        secondView = new SecondView();
        thirdView = new ThirdView();

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Paso 1", firstView);
        tabbedPane.addTab("Paso 2", secondView);
        tabbedPane.addTab("Paso 3", thirdView);

        add(tabbedPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public FirstView getFirstView() {
        return firstView;
    }

    public SecondView getSecondView() {
        return secondView;
    }

    public ThirdView getThirdView() {
        return thirdView;
    }
}
