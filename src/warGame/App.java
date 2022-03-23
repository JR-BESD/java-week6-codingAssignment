package warGame;

public class App {

    public static void main(String[] args) {

	Deck deck = new Deck();
	Player player1 = new Player("Tom");
	Player player2 = new Player("Susan");
	String winner;
	
	deck.shuffle(deck.getCards());

	/*
	 * Players take turns drawing cards from the deck.
	 */
	for (int i = 0; i < 52; i++) {
	    if (i % 2 == 0) {
		player1.draw(deck);
	    } else {
		player2.draw(deck);
	    }
	}

	/*
	 * Players each flip over one card and battle.
	 * High card wins the battle and gains one point. 
	 * Players compete in 26 battles
	 */
	for (int i = 0; i < 26; i++) {
	    Card playCard1 = player1.flip();
	    Card playCard2 = player2.flip();

	    if (playCard1.getValue() > playCard2.getValue()) {
		player1.incrementScore();
	    } else if (playCard2.getValue() > playCard1.getValue()) {
		player2.incrementScore();
	    }
	}

	/*
	 * Determine the winner by comparing the final score.
	 */
	if (player1.getScore() > player2.getScore()) {
	    winner = "Player 1: " + player1.getName();
	} else if (player2.getScore() > player1.getScore()) {
	    winner = "Player 2: " + player2.getName();
	} else {
	    winner = "Draw";
	}

	/*
	 * Display final score with the position and name of the winning player.
	 */
	System.out.println("Final Score: \n" + player1.getName() + " - " + player1.getScore() + "\n" + player2.getName()
		+ " - " + player2.getScore() + "\n");
	if (player1.getScore() == player2.getScore()) {
	    System.out.println("It's a Draw!");
	} else {
	    System.out.println(winner + " WINS!!!");
	}
    }
}
