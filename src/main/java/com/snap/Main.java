package com.snap;

public class Main {
    public static void main(String[] args) {
        CardGame cardgame = new CardGame("snap");
        cardgame.createDeck();
        System.out.println(cardgame.getDeck());
        System.out.println(cardgame.getDeck().size());
        cardgame.sortCards(CardSorting.byValue);
        cardgame.sortCards(CardSorting.bySuit);
        cardgame.sortCards(CardSorting.shuffle);
    }
}