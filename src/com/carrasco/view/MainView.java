package com.carrasco.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private JPanel contentPane;
    private FirstView firstView;
    private SecondView secondView;
    private ThirdView thirdView;

    public MainView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Unit converter - Christo");
        setPreferredSize(new Dimension(400, 400));
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setLayout(new CardLayout());
        setContentPane(contentPane);

        firstView = new FirstView();
        contentPane.add(firstView, "firstView");
        secondView = new SecondView();
        contentPane.add(secondView, "secondView");
        thirdView = new ThirdView();
        contentPane.add(thirdView, "thirdView");

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

    public void showFirstView() {
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.show(contentPane, "firstView");
    }

    public void showSecondView() {
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.show(contentPane, "secondView");
    }

    public void showThirdView() {
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.show(contentPane, "thirdView");
    }
}
