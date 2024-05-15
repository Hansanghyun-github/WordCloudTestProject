package org.example;

public class Main {

    private static final int MB = 1024*1024;
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory()/MB + "MB");
        System.out.println(Runtime.getRuntime().totalMemory()/MB + "MB");
        System.out.println(PropertyLoader.getProperty("morphemeAPIKey"));

    }
}