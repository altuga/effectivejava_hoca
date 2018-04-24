// Singleton with static factory - Page 17
package org.effectivejava.examples.chapter02.item03.kodcu.method;

public class Pencil {
	private static final Pencil INSTANCE = new Pencil();

	private Pencil() {
	}

	public static Pencil  getInstance() { // possible multi thread attaks
		return INSTANCE;
	}

	public void write() {
		System.out.println("write !");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Pencil pencil = Pencil.getInstance();
		pencil.write();

		// method advantage : you can use it in lambda exp
		//Pencil::getInstance
	}


}
