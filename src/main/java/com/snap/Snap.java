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
        System.out.println("First Card is being dealt, to deal more cards, press Enter");
        Card firstCard = dealCard();
        while (!faceMatch) {
            commands.getUserInput();
            Card newCard = dealCard();
            System.out.println("Press Enter to deal another card");
            if (firstCard.getCardFace().equals(newCard.getCardFace())) {
                if (commands.winnerSnap().equals("snap")) {
                    System.out.println("It's a match! Congratulations, you've won!");
                    System.out.println("Would you like to play again? Y/N");
                    restartSnap();
//                    faceMatch = true;
                } else if (commands.winnerSnap().equals("")) {
                    firstCard = newCard;
                    System.out.println("Sorry! You missed a snap, press Enter to deal another card");
                }


            } else {
                firstCard = newCard;
            }

        }
    }
}


