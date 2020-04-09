package com.codecool.battleships;
import java.util.Scanner;

public class Tools {

    public static Scanner scanner = new Scanner(System.in);

    public static String takeOrientationInput(String messageToUser) {
        System.out.println(messageToUser); //message should ask for input h or v for orientation
        String userInput = "";
        boolean validUserInput = false; //used for checking if the user inputs h or v and not sth else
        while (!validUserInput) {
            userInput = scanner.next().toUpperCase();
            if (userInput.equals("H") || userInput.equals("V")) {
                validUserInput = true;
            }
        }
        return userInput;
    }

//    public static void clearScreen() {
//        try {
//            new ProcessBuilder("clear").inheritIO().start().waitFor();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }


}
