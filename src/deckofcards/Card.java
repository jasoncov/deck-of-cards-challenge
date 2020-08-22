package deckofcards;

/**
 * Card model object
 * @author Jason Covert
 * @version 1.0
 *
 */

public class Card {
    /**
     * Available suits for a standard playing card.
     */
    enum Suits {
        Clubs, Diamonds, Hearts, Spades
    }

    /**
     * Available face values for a standard playing card.
     */
    enum FaceValues {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    /**
     * A card's suit.
     */
    public Suits suit;

    /**
     * A card's rank or value.
     */
    public FaceValues faceValue;

    /**
     * Constructor
     * Creates a standard playing card.
     * @param suit the suit of the playing card to be created.
     * @param faceValue the rank or value of the playing card to be created
     */
    public Card(Suits suit, FaceValues faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

   /**
    * Returns a string representation of a card; including suit and face value.
    * @return string representation of a card.
    */
    public String toString() {
        return this.faceValue + " of " + this.suit;
    }
}