package com.workintech.employeeApp.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private void checkGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            boolean isExist = false;
            for (String developername : developerNames) {
                if (developername.equals(name)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                if (developerNames[index] == null) {
                    developerNames[index] = name;
                } else {
                    System.out.println("A developer already exist in the relevant index");
                }
            } else {
                System.out.println("Employee " + name + " already exists");
            }
            this.developerNames[index] = name;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Assignment for a non-existent index");
        }
    }

    public String toString() {
        return "Name: " + name + " Giro: " + giro + " developers: " + Arrays.toString(developerNames);
    }
}
