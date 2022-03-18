package com.it_academy.tests.onliner.hooks;

import com.it_academy.onliner.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHooks {

    @Before
    public void setUpDriver(){
        DriverManager.setUpDriver();
    }

    @After
    public void quitDriver() {
        DriverManager.quitDriver();
    }
}
