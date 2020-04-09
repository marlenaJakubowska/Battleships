package com.codecool.battleships;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Tools {

    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, Integer> shipTypeAndLength;
    public static Character[] charactersAJ = new Character[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    public static Map<Character, Integer> charsToNums;

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

    public static void createHashMaps() {
        shipTypeAndLength = new HashMap<>();
        shipTypeAndLength.put("Carrier", 5);
        shipTypeAndLength.put("Battleship", 4);
        shipTypeAndLength.put("Cruiser", 3);
        shipTypeAndLength.put("Submarine", 3);
        shipTypeAndLength.put("Destroyer", 2);

        charsToNums = new HashMap<>();
        for (int i = 0; i<10; i++) {
            charsToNums.put(charactersAJ[i], i);
        }

    }

    public static String takePositionInput(String messageToUser) {
        System.out.println(messageToUser);
        boolean validUserInput = true;
        String userInput;
        do {
            if (!validUserInput) {
                System.out.println("Please use correct format like A9 or something like that -_-");
            }
            validUserInput = false;
            userInput = scanner.next().toUpperCase();
            if (!userInput.equals("") && userInput.length() > 1) {
                if (userInput.substring(1).matches("^[0-9]*$")) {
                    if (Arrays.asList(charactersAJ).contains(userInput.charAt(0))
                        && Integer.parseInt(userInput.substring(1)) > 0
                                && Integer.parseInt(userInput.substring(1)) <= 10) {
                        validUserInput = true;

                    }
                }
            }
        } while (!validUserInput);
        return userInput;
    }

    public static int convertCharacterToNumber(Character character) {
        return charsToNums.get(character);
    }



//    public static void clearScreen() {
//        try {
//            new ProcessBuilder("clear").inheritIO().start().waitFor();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }


}
