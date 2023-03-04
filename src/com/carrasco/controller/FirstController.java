package com.carrasco.controller;

import com.carrasco.view.FirstView;
import com.carrasco.view.MainView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstController {
    private MainView mainView;
    private FirstView firstView;

    public FirstController(MainView mainView) {
        this.mainView = mainView;
        this.firstView = mainView.getFirstView();
        firstView.getContinueButton().addActionListener(new ContinueButtonListener());
        firstView.getCancelButton().addActionListener(new CancelButtonListener());
    }

    private class ContinueButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = firstView.getComboBox().getSelectedIndex();

            if (selectedIndex == 0) mainView.showSecondView();
            if (selectedIndex != 0)
                JOptionPane.showMessageDialog(firstView, "No se puede encontrar el módulo especificado, intente seleccionar DIVISAS.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class CancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
