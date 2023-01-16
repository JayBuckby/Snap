package com.snap;

public class Snap extends CardGame {
    Commands commands = new Commands();
    boolean faceMatch = false;

    public Snap() {
        super("snap");
    }

    private void restartSnap() {
        if (commands.restartSnap().equals("y")) {
            System.out.println("Game is restarting");
            snapGame();
        } else {
            String playersTurn = "";
            faceMatch = true;
        }
    }

    public void snapGame() {
        createDeck();
        sortCards(CardSorting.shuffle);
        System.out.println("\uD83C\uDD56\uD83C\uDD50\uD83C\uDD5C\uD83C\uDD54 \uD83C\uDD58\uD83C\uDD5D\uD83C\uDD58\uD83C\uDD63\uD83C\uDD58\uD83C\uDD50\uD83C\uDD5B\uD83C\uDD58\uD83C\uDD62\uD83C\uDD58\uD83C\uDD5D\uD83C\uDD56");
        System.out.println("Welcome to the game of Snap! The rules are simple, hit Enter to deal a card, if a match presents itself, then type snap to claim it and win, but don't miss your chance!");
        System.out.println("The starting card is being dealt");
        Card firstCard = dealCard();
        String playersTurn = "The first card has been drawn, player one take your turn";
        String playersSwitch = "Player One this is your card";
        System.out.println(playersTurn);
        playersTurn = "Player One draw your card";
        while (!faceMatch) {
            commands.getUserInput();
            Card newCard = dealCard();
            System.out.println(playersSwitch);
            if (firstCard.getCardFace().equals(newCard.getCardFace())) {
                String userInput = commands.winnerSnap();
                if (userInput.equals("snap")) {

                    System.out.println("It's a match! Congratulations, you've won!");
                    System.out.println("Would you like to play again? Y/N");
                    restartSnap();
                } else {
                    firstCard = newCard;
                    System.out.println("Sorry! You missed a snap, remember you must type snap to win on a correct match, press Enter to deal another card");
                }


            } else {
                firstCard = newCard;
            }

            playersSwitch = playersSwitch.equals("Player One this is your card") ? "Player Two this is your card" : "Player One this is your card";
            playersTurn = playersTurn.equals("Player One draw your card") ? "Player Two draw your card" : "Player One draw your card";
            if (faceMatch) {
                System.out.println("Thanks for playing");
            } else {
                System.out.println(playersTurn);
            }
        }
    }
}


