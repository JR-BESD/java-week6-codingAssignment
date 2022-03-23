package warGame;

public class Card {
    private int value;
    private String name;

    public Card() {
    }

    public Card(int value, String name) {
	this.setValue(value);
	this.setName(name);
    }

    /**
     * prints information about each card
     */
    public void describe() {
	System.out.println(name + ": " + value + " points!");
    }

    /**
     * @return the value
     */
    public int getValue() {
	return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
	this.value = value;
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
