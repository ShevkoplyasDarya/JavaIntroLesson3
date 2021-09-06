package ru.shevkoplyas;

import java.sql.SQLOutput;

public class Television {
    String brand;
    String model;
    boolean isColour;
    String[] settings = {"volume", "brightness", "contrast"};

    public Television(String brand, String model, boolean isColour) {
        this.brand = brand;
        this.model = model;
        this.isColour = isColour;
    }

    void turnOnTV() {
        System.out.println(brand + " " + model + " is On");
    }

    void turnOffTV() {
        System.out.println(brand + " " + model + " is Off");
    }

    Television colorTV() {
        if (isColour) {
            System.out.println("New color TV");
        } else {
            System.out.println("Old black & white TV");
        }
        return this;
    }

    void settingsMenu() {
        int i = 0;
        while (i < settings.length) {
            System.out.println(settings[i]);
            i++;
        }
    }


}
