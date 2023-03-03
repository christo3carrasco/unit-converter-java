package com.carrasco.view;

import javax.swing.*;
import java.awt.*;

public class ThirdView extends JPanel {
    private JLabel label;
    private JTextField textField;
    private JButton cancelButton, acceptButton;

    public ThirdView() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        label = new JLabel("Cantidad:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        add(label, gbc);

        textField = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 10, 0);
        add(textField, gbc);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 0));
        cancelButton = new JButton("Cancelar");
        acceptButton = new JButton("Aceptar");
        buttonsPanel.add(cancelButton);
        buttonsPanel.add(acceptButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(buttonsPanel, gbc);
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JButton getAcceptButton() {
        return acceptButton;
    }
}
