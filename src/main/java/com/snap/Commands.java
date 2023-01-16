package com.snap;

import java.util.Scanner;

public class Commands {
    Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        String userInput = "";
        boolean cardLoop = true;

        while (cardLoop) {

            userInput = scanner.nextLine();
            if (!userInput.isEmpty() && !userInput.equals("snap")) {
                System.out.println("Invalid key, press Enter to deal a card");
            } else if (userInput.equals("snap")) {
                System.out.println("There isn't a match, press Enter to deal a card");

            } else {
                cardLoop = false;
            }
        }
        return userInput;
    }

    public String winnerSnap() {
        String winningInput = "";
        winningInput = scanner.nextLine();


        return winningInput;
    }

    public String restartSnap() {
        String restarting = "";
        restarting = scanner.nextLine();
        return restarting;
    }

    public String takeNames() {
        String name = "";
        name = scanner.nextLine();
        return name;
    }
}



