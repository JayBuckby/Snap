package com.snap;

public class Card {

    private final String cardSuit;
    private final String cardFace;
    private final int cardValue;


    public Card(String cardSuit, String cardFace, int cardValue) {
        this.cardSuit = cardSuit;
        this.cardFace = cardFace;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardFace() {
        return cardFace;
    }

    @Override
    public String toString() {
        return "[" +
                cardFace +
                cardSuit + "]";
    }
}


