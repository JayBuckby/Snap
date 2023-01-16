package com.snap;

import java.util.Comparator;

public class SortDeckIntoSuits implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getCardSuit().compareTo(o2.getCardSuit());
    }
}
