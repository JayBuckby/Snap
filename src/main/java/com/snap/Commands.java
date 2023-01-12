package com.snap;

import java.util.Scanner;

public class Commands extends Player {
    Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        String userInput = "";
        boolean cardLoop = true;
//        boolean isThereAMatch = false;

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

        // IN HERE ADD A NEW SCANNER THAT IS ACTIVATED WHEN THE IF STATEMENT ON THE SNAP CLASS IS TRUE.

        return winningInput;
    }
}



