package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name) {
        try {
            boolean isExist = false;
            for (String healthplan : healthplans) {
                if (healthplan.equals(name)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("An assignment already exists for the relevant index");
                }
            } else {
                System.out.println("Healthplan " + name + " already exists");
            }
            this.healthplans[index] = name;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Assignment for a non-existent index");
        }
    }

    public String toString() {
        return "FullName: " + fullName + " Healthplans: " + Arrays.toString(healthplans);
    }
}
