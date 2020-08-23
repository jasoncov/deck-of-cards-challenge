package deckofcards;

/**
 * Deck model object
 * @author Jason Covert
 * @version 1.0
 * @see Card
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    /**
     * A list of card objects that make up a deck of cards.
     */
    private ArrayList<Card> deck = new ArrayList<Card>();

    /**
     * Constructor
     * Creates a standard 52 playing card deck.
     */
    public Deck() {
        // Iterate though each suit
        for (Card.Suits suit : Card.Suits.values()) {
            // Iterate though each face value
            for (Card.FaceValues value : Card.FaceValues.values()) {
                // Create card for the current suit and face value
                Card c = new Card(suit, value);
                // Add the card to the deck
                this.deck.add(c);
            }
        }
    }

    /**
     * Utilizes the Fisher–Yates algorithm to swap a card object at a random index in the deck.
     */
    public void shuffle() {
        // The number of cards in the deck
        int numberOfCards = this.deck.size();
        // Initialize new Random object
        Random r = new Random();
        // Iterate through the deck of cards
        for (int i = numberOfCards - 1; i > 0; i--) {
            // Get the next random index
            int j = r.nextInt(i + 1);
            // Create a temporary card with the card from index i
            Card temp = this.deck.get(i);
            // Store the card from index j at index i
            this.deck.set(i, this.deck.get(j));
            // Store temporary card at index j
            this.deck.set(j, temp);
        }
    }

    /**
     * Draws a single card from the deck.
     * @return a card from the deck.
     */
    public Card drawOneCard() {
        // Return null if the deck is empty
        if(this.deck.size() == 0) {
            return null;
        }
        // Return the drawn card
        return this.deck.remove(0);
    }

    /**
     * Returns a string representation of a list of cards in a deck; including suit and face value of each card.
     * @return string representation of a deck.
     */
    public String toString() {
        String deckString = "";
        for (int i = 0; i < this.deck.size(); i++) {
            // if the current card is the last card in the deck print the card, else add a comma and space after the card
            if (i == this.deck.size() - 1) {
                deckString += this.deck.get(i);
            } else {
                deckString += this.deck.get(i) + ", ";
            }
        }
        return deckString;
    }
}
