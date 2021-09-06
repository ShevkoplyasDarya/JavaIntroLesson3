package ru.shevkoplyas;

public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television("Samsung", "A230", true);
        Television tv2 = new Television("LG", "P500", false);

        tv1.turnOffTV();
        tv2.turnOnTV();

        tv1.colorTV();
        tv2.colorTV();

        tv1.settingsMenu();

    }
}
