package day1;

import java.util.Arrays; //import package

public class Card {
	private String face; // encapsulated private field
	private char suit;	// encapsulated private field
	
	public Card(String face, char suit) { //constructor
		this.face = face;
		this.suit = suit;
	}
	
	public String getFace() { 
		return this.face; 
	}  
	public char getSuit() { 
		return this.suit; 
	}
	
	private static final String[] ALL_FACES = new String[] {  "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
	};

	public void setFace(String face) {
	if (Arrays.stream(ALL_FACES).noneMatch(f -> f.equals(face)))  
		throw new IllegalArgumentException("Invalid face: "	+ face);
	this.face = face;
	}
	private static final String ALL_SUITS = "♣♦♥♠";

	public void setSuit(char suit) {
	if (ALL_SUITS.indexOf(suit) == -1)
		throw new IllegalArgumentException("Invalid suit: " + suit);  
	this.suit = suit;
	}
	
	public String toString() {
		return this.face + this.suit;
	}

}