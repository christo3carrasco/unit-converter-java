package com.carrasco.view;

import com.carrasco.util.DataCombo;

import javax.swing.*;
import java.awt.*;

public class FirstView extends JPanel {
    private JLabel label;
    private JComboBox<String> comboBox;
    private JButton continueButton, cancelButton;

    public FirstView() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        label = new JLabel("Unidad para calcular:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        add(label, gbc);

        comboBox = new JComboBox<>(DataCombo.unitsCombo.toArray(String[]::new));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 10, 0);
        add(comboBox, gbc);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 0));
        cancelButton = new JButton("Cancelar");
        continueButton = new JButton("Continuar");
        buttonsPanel.add(cancelButton);
        buttonsPanel.add(continueButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(buttonsPanel, gbc);
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    public JButton getContinueButton() {
        return continueButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
