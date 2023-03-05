package com.carrasco.controller;

import com.carrasco.model.Currency;
import com.carrasco.view.MainView;
import com.carrasco.view.SecondView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.carrasco.App.currencies;

public class SecondController {
    private MainView mainView;
    private SecondView secondView;

    public SecondController(MainView mainView) {
        this.mainView = mainView;
        this.secondView = mainView.getSecondView();
        secondView.getContinueButton().addActionListener(new ContinueListener());
        secondView.getCancelButton().addActionListener(new CancelListener());
    }

    private class ContinueListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = secondView.getComboBox().getSelectedIndex();
            currencies.add(new Currency(selectedIndex + 1));
            mainView.showThirdView();
        }
    }

    private class CancelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainView.showFirstView();
        }
    }
}
