// Takes earth-weight and prints table of weights on all planets - Page 150
package org.effectivejava.examples.chapter06.item30.kodcu.fixed;


public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble("10");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}
