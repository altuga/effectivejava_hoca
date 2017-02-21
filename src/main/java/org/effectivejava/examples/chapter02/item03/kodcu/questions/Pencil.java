// Singleton with static factory - Page 17
package org.effectivejava.examples.chapter02.item03.kodcu.questions;

public class Pencil {

    // make this class in a Singleton way

	public void write() {
		System.out.println("Writing!");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		pencil = new Pencil();  // always new object is created, not good
		pencil = new Pencil();  // always new object is created, not good
		pencil.write();
	}
}
