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
            faceMatch = true;
        }
    }

    public void snapGame() {
        createDeck();
        sortCards(CardSorting.shuffle);
        System.out.println("First Card is being dealt, to deal more cards, press Enter, to claim a match, you must type snap.");
        Card firstCard = dealCard();
        String playersTurn = "The First card has been drawn, player one take your turn";
        String playersSwitch = "Player One this is your card";
        System.out.println(playersTurn);
        playersTurn = "Player One draw your card";
        while (!faceMatch) {
            commands.getUserInput();
            Card newCard = dealCard();
            System.out.println(playersSwitch);
            System.out.println("Press Enter to deal another card");
            if (firstCard.getCardFace().equals(newCard.getCardFace())) {
                String userEnter = commands.winnerSnap();
                if (userEnter.equals("snap")) {

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
            System.out.println(playersTurn);
        }
    }
}


