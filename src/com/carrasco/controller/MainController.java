package com.carrasco.controller;

import com.carrasco.view.MainView;

public class MainController {
    public MainController(MainView mainView) {
        new FirstController(mainView);
        new SecondController(mainView);
        new ThirdController(mainView);
    }
}
