package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        ArrayList<Player> players = new ArrayList<>();
//        Player playa1 = new Player("Bob");
//        Player playa2 = new Player("Sarah");
//        playa1.takeCard(deck.deal());
        players.add(new Player("McLovin"));
        players.add(new Player("Beef Stew"));

        for (Player p : players) {
            p.takeCard(deck.deal());
            p.takeCard(deck.deal());
        }
        for (Player p : players) {
            System.out.println(p.toString());
        }




    }
}
