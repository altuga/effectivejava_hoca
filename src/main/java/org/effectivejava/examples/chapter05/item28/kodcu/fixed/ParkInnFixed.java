// Generic union method with wildcard types - Pages 137-138
package org.effectivejava.examples.chapter05.item28.kodcu.fixed;

import java.util.HashSet;
import java.util.Set;

public class ParkInnFixed {

	public static <E> Set<E> birlestir(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	// Simple program to exercise flexible generic method
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(1);
		integers.add(3);
		integers.add(5);

		Set<Double> doubles = new HashSet<Double>();
		doubles.add(2.0);
		doubles.add(4.0);
		doubles.add(6.0);


		Set<Number> numbers = ParkInnFixed.<Number>birlestir(integers, doubles);

		System.out.println(numbers);
	}
}
