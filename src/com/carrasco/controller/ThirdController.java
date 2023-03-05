package com.carrasco.controller;

import com.carrasco.view.MainView;
import com.carrasco.view.ThirdView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.carrasco.App.currencies;

public class ThirdController {
    private MainView mainView;
    private ThirdView thirdView;

    public ThirdController(MainView mainView) {
        this.mainView = mainView;
        this.thirdView = mainView.getThirdView();
        thirdView.getAcceptButton().addActionListener(new AcceptButtonListener());
        thirdView.getCancelButton().addActionListener(new CancelListener());
    }

    private class AcceptButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = thirdView.getTextField().getText();

            try {
                double res = currencies.get(currencies.size() - 1).convert(Double.parseDouble(inputText));
                JOptionPane.showMessageDialog(thirdView, "Calculo: " + res);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(thirdView, "Ingresar una CANTIDAD.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class CancelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainView.showSecondView();
        }
    }
}
