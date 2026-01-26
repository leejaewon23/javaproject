package org.example;

public class Television {
    static String company = "Mycompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
