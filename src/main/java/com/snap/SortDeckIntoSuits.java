package com.snap;

import java.util.Comparator;

public class SortDeckIntoSuits implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getCardSuit().equals(o2.getCardSuit())) {
            return o1.getCardSuit().compareTo(o2.getCardSuit());
        }
        return o1.getCardSuit().compareTo(o2.getCardSuit());
    }
}
