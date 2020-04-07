package com.codecool.battleships;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UI {
    private Scanner input = new Scanner(System.in);
    private Boolean isRunning = true;
    private List<String> options = Arrays.asList("SinglePlayer", "Multiplayer", "Simulation", "Exit");
    private List<String> difficulties = Arrays.asList("Easy", "Medium", "Hard");
    // private Player player = new Player(null);
}

  public void printList(List<String> list) {
        System.out.println();
        for (String option : list) {
            System.out.println((list.indexOf(option) + 1) + ". " + option);
        }
    }
    public void printMainMenu() {
        System.out.println("Main menu");
        System.out.println("1. New game");
        System.out.println("2. Exit");
    }
    
 public String getString() {
        String userString = input.nextLine();
        return userString;
    }

    public int getInt() {
        String userInt = input.nextLine();
        return Integer.parseInt(userInt);
    }

   public void showGameBoard(Square[][] gameBoard) {
        int iterator = 0;
        System.out.println("|---------------------|");
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + gameBoard[i][j].getSign());
                iterator++;
                if (iterator % 10 == 0) {
                    System.out.println(" |");
                    System.out.print("|");
                }
            }
        }
        System.out.println("---------------------|");        
    }

 public void printMap(Map<String, Integer> map) {
        System.out.println("Name of the ship (lenght): ");
        int i = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
            i = i + 1;
        }
    }

public void start() {
        while (isRunning) {
            printMainMenu();
            int mainMenu = getInt();
            if (mainMenu == 1) {
                System.out.println("Select game type:");
                printList(options);
                int option = getInt();
    
                switch (option) {
                    case 1: {
                        System.out.println("Player vs AI");
                        
                        System.out.println("Enter Player's name :");
                        player.setPlayer1(new Player(getString()));
                        player.setPlayer2(new Player("Bot"));
                        printList(difficulties);
                        Integer difficulty = getInt();
   
                        break;
                }
                case 2:
                {   System.out.println("Enter Player 1 name :");
                    player.setPlayer1(new Player(getString()));
    
                    System.out.println("Enter Player 2 name :");
                    player.setPlayer2(new Player(getString()));
                    printList(difficulties);
                    Integer difficulty = getInt();
                    Game.switchDifficulty(difficulty);
                
                    break;
                }
                case 3:
                {
                    System.out.println("AI vs AI");
                    break;            
                }  
                case 4:
                {                
                    input.close();
                    isRunning = false;
                }
                default:
                    break;
                }
            }
            else if (mainMenu == 2) {
                isRunning = false;
            }
        }
    }
}
