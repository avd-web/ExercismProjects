package com.LogLevels;

public class logLevels {

    public static void main(String[] args) {
        System.out.println(message("[ERROR]: Invalid operation"));
        System.out.println(logLevel("[ERROR]: Invalid operation"));
        System.out.println(reformat("[ERROR]: Invalid operation"));
    }

    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0]
                .trim()
                .substring(1) //Removes the first character "[" and puts in in a substring
                .toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

}


