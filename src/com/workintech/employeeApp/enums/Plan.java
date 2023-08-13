package com.workintech.employeeApp.enums;

public enum Plan {
    BASIC("BASIC", 1000),
    NORMAL("NORMAL", 3000),
    ADVANCE("ADVANCE", 5000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
