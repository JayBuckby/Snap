package com.snap;

import java.util.Comparator;

public class SortDeckInNumberOrder implements Comparator <Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getCardValue() - o2.getCardValue();
    }
}
