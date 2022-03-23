package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
	createSuit("Spades");
	createSuit("Hearts");
	createSuit("Clubs");
	createSuit("Diamonds");

    }

    public List<Card> createDeck() {
	List<Card> newDeck = new ArrayList<>();
	createSuit("Spades");
	return newDeck;
    }

    /*
     * shuffle the deck
     */
    public void shuffle(List<Card> cards) {
	Collections.shuffle(cards);
    }

    /*
     * draw a card from the deck
     */
    public Card draw() {
	Card card = new Card();
	card = cards.get(0);
	cards.remove(0);
	return card;
    }

    /*
     * add cards to the deck by suit.
     */
    public void createSuit(String suit) {
	Card tmpCard = new Card();
	for (int i = 2; i <= 14; i++) {
	    if (i < 11) {
		tmpCard = new Card(i, spellNumber(i) + " of " + suit);
		cards.add(tmpCard);
	    } else if (i == 11) {
		tmpCard = new Card(i, "Jack of " + suit);
		cards.add(tmpCard);
	    } else if (i == 12) {
		tmpCard = new Card(i, "Queen of " + suit);
		cards.add(tmpCard);
	    } else if (i == 13) {
		tmpCard = new Card(i, "King of " + suit);
		cards.add(tmpCard);
	    } else if (i == 14) {
		tmpCard = new Card(i, "Ace of " + suit);
		cards.add(tmpCard);
	    }
	}
    }

    /*
     * return the spelling of a number 2-10
     */
    public String spellNumber(int number) {
	if (number == 2) {
	    return "Two";
	} else if (number == 3) {
	    return "Three";
	} else if (number == 4) {
	    return "Four";
	} else if (number == 5) {
	    return "Five";
	} else if (number == 6) {
	    return "Six";
	} else if (number == 7) {
	    return "Seven";
	} else if (number == 8) {
	    return "Eight";
	} else if (number == 9) {
	    return "Nine";
	} else if (number == 10) {
	    return "Ten";
	}
	return null;
    }

    /**
     * @return the cards
     */
    public List<Card> getCards() {
	return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(List<Card> cards) {
	this.cards = cards;
    }
}
