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
