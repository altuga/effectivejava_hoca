// Avoid float and double if exact answers are required!! - Page 48
package org.effectivejava.examples.chapter08.item48;

import java.math.BigDecimal;

public class Arithmetic {
	public static void main(String[] args) {

		howManyCandies1();
		System.out.println();

		howManyCandies2();
		System.out.println();


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
