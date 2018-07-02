
package org.effectivejava.examples.chapter06.item32.kodcu.questions;

public class Metin {
	public static final int BOLD = 1 ;
	public static final int ITALIC = 2 ;
	public static final int UNDERLINE = 3;
	public static final int STRIKETHROUGH = 4;


	public void secilenStiliUygula(int stiller) {
		// Body goes here
	}

	// Sample use
	public static void main(String[] args) {
		Metin metin = new Metin();
		metin.secilenStiliUygula(BOLD);
	}
}
