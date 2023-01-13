package com.snap;

public class Snap extends CardGame {
    Commands commands = new Commands();
    boolean faceMatch = false;

    public Snap() {
        super("snap");
    }

    private void restartSnap(){
       if (commands.restartSnap().equals("y")) {
           System.out.println("Game is restarting");
           snapGame();
       } else {faceMatch = true;}
    }

    public void snapGame() {
        createDeck();
        sortCards(CardSorting.shuffle);
        System.out.println("First Card is being dealt, to deal more cards, press Enter, to claim a match, you must type snap.");
        Card firstCard = dealCard();
        String playersTurn = "player-1";
        System.out.println(playersTurn);
        while (!faceMatch) {
            commands.getUserInput();
            Card newCard = dealCard();
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
        playersTurn = playersTurn.equals("player-1") ? "player-2" : "player-1";
            System.out.println(playersTurn);
        }
    }
}


