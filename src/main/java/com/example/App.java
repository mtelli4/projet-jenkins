package com.example;

public class App {
    public String getMessage() {
        return "IUT Gustave Eiffel";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}