package com.snap;

public class Snap extends CardGame {
    Commands commands = new Commands();
    boolean faceMatch = false;

    public Snap() {
        super("snap");
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
                    faceMatch = true;
                } else if (commands.winnerSnap().equals("")) {
                    System.out.println("You missed a snap, press Enter to deal another card");
                    firstCard = newCard;
                }


            } else {
                firstCard = newCard;
            }

        }
    }
}


