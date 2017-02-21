// Enum singleton - the preferred approach - page 18
package org.effectivejava.examples.chapter02.item03.kodcu.enumoration;

public enum Pencil {
	INSTANCE; // guarantee against multiple instantiation

	public void write() {
		System.out.println("write !");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Pencil pencil = Pencil.INSTANCE;
		pencil.write();
	}
}
