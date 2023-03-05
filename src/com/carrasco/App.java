package com.carrasco;

import com.carrasco.controller.MainController;
import com.carrasco.model.Currency;
import com.carrasco.view.MainView;

import java.util.ArrayList;

public class App {
    public final static ArrayList<Currency> currencies = new ArrayList<>();

    public static void main(String[] args) {
        MainView mainView = new MainView();
        new MainController(mainView);
    }
}
