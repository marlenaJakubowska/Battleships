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
    
