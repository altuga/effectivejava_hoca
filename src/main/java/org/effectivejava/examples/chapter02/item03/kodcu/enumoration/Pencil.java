
package org.effectivejava.examples.chapter02.item03.kodcu.enumoration;

public enum Pencil {
	INSTANCE; // guarantee against multiple instantiation and thread safe for free

	public void write() {
		System.out.println("write !");
	}


	public static void main(String[] args) {
		Pencil pencil = Pencil.INSTANCE;
		pencil.write();



	}
}
