// Serializable singleton with public final field - Page 18
package org.effectivejava.examples.chapter02.item03.kodcu.serializable;

public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	private Object readResolve() {
		// Return the one true Pencil and let the garbage collector
		// take care of the Pencil impersonator.
		return INSTANCE;
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
