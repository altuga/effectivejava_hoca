// Singleton with public final field - Page 17
package org.effectivejava.examples.chapter02.item03.kodcu.field;

public class Pencil {
	public static final Pencil INSTANCE = new Pencil();

	private Pencil() {
	}

	public void justDoIt() {
		System.out.println("I'm writing ... ");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Pencil pencil = Pencil.INSTANCE;
		pencil.justDoIt();
	}
}
