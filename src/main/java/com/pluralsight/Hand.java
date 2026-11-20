package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public void deal(Card card){
        for (int i = 0; i >= 2; i ++) {
            cards.add(card);
        }
    }
    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card: cards){

            value += card.getPointValue();

        }
        return value;
    }
    public void addCard(Card card) {
        cards.add(card);
    }

    public String toString() {
        String results = "";
        for (int i = 0; i < this.cards.size(); i++) {
            Card c = this.cards.get(i);
            results += c.getValue() + " of " + c.getSuit();
            if (i != this.cards.size() - 1) {
                results += ", ";
            }
        }
        return results;
    }
}
