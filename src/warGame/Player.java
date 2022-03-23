package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player(String name) {
	this.setName(name);
	setScore(0);
    }

    /*
     * provides information for each card in hand.
     */
    public void describe() {
	for (Card card : hand) {
	    card.describe();
	}
    }

    /*
     * flips top card from hand to play area
     */
    public Card flip() {
	Card card = hand.get(0);
	hand.remove(0);
	return card;
    }

    /*
     * draws a card from the deck to the hand
     */
    public void draw(Deck deck) {
	hand.add(deck.draw());
    }

    /*
     * adds 1 to player score
     */
    public void incrementScore() {
	setScore(getScore() + 1);
    }

    /**
     * @return the score
     */
    public int getScore() {
	return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
	this.score = score;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

}
