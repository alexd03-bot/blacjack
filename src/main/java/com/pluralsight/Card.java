package com.pluralsight;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit(){
        return suit;
    }
    public String getValue(){
        return value;
    }
    public int getPointValue(){
        switch (this.value) {
            case "2", "3", "4", "5", "6", "7", "8",  "9",  "10" -> {
                return Integer.parseInt(this.value);
            }
            case "J", "Q", "K" -> {return 10;}
            case "A" -> {return 11;}
            default -> {throw new RuntimeException("Unknown card");}

        }

    }

}
