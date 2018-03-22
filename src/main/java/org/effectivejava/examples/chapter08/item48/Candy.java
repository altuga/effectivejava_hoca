// Avoid float and double if exact answers are required!! - Page 48
package org.effectivejava.examples.chapter08.item48;

import java.math.BigDecimal;

public class Candy {
	public static void main(String[] args) {

		basicCalculation();
		midCalculation();

		howManyCandies1();
		System.out.println();

		howManyCandies2();
		System.out.println();




	}

	private static void midCalculation() {
		// floating point calculation
		final double amount1 = 2.0;
		final double amount2 = 1.1;
		System.out.println("difference between 2.0 and 1.1 using double is: " + (amount1 - amount2));

		// Use BigDecimal for financial calculation
		final BigDecimal amount3 = new BigDecimal("2.0");
		final BigDecimal amount4 = new BigDecimal("1.1");
		System.out.println("difference between 2.0 and 1.1 using BigDecimal is: " + (amount3.subtract(amount4)));
	}

	public static void basicCalculation() {
		System.out.println(1.03 - .42);
	}

	// Broken - uses floating point for monetary calculation!
	public static void howManyCandies1() {
		double funds = 1.00;
		int itemsBought = 0;
		for (double price = .10; funds >= price; price += .10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Change: $" + funds);
	}

	public static void howManyCandies2() {
		final BigDecimal TEN_CENTS = new BigDecimal( ".10");
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
			itemsBought++;
			funds = funds.subtract(price);
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);
	}



}
