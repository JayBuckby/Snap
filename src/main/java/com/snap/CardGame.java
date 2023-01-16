package com.snap;

import java.util.ArrayList;
import java.util.Collections;


public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>(52);
    private String name;

    private final int[] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private final String[] cardFace = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final String[] cardSuit = {"♢", "♤", "♡", "♧"};

    public void createDeck() {
        for (String s : cardSuit) {
            for (int j = 0; j < cardFace.length; j++) {
                deckOfCards.add(new Card(s, cardFace[j], cardValue[j]));
            }
        }
    }


    public String getName() {
        return name;
    }

    public CardGame(String name) {
        this.name = name;
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }

    public void sortCards(CardSorting sortingMethod) {
        switch (sortingMethod) {
            case byValue:
                deckOfCards.sort(new SortDeckInNumberOrder());
                break;
            case bySuit:
                deckOfCards.sort(new SortDeckIntoSuits());
                break;
            case shuffle:
                Collections.shuffle(deckOfCards);
                break;
        }

    }

    public Card dealCard() {
        Card takeCard = deckOfCards.get(deckOfCards.size() - 1);
        deckOfCards.remove(deckOfCards.size() - 1);
        System.out.println(takeCard);
        if (getDeck().size() == 0) {
            createDeck();
            sortCards(CardSorting.shuffle);

        }
        return takeCard;


    }
}
