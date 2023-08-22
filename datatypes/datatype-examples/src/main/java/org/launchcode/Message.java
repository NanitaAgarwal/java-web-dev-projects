package org.launchcode;

public class Message {

//    private static String getMessage(String lang) {
    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("hin")) {
            return "Namaste Duniya!";
        } else {
            return "Hello, World!";
        }
    }
}
