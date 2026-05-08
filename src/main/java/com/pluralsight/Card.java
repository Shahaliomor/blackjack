package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = true;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getPointValue() {
        if (value.equals("A")) {
            return 11;
        } else if (value.equals("K") || value.equals("Q") || value.equals("J")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
    }

    public String toString() {
        return value + " of " + suit;
    }
}