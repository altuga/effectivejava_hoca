package org.effectivejava.examples.chapter05.item23.kodcu.fixed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Raw {

	public static void main(String[] args) {
		Set<String> strings = new HashSet<String>();
		strings.add(new String("adad"));

		Set<Integer> integers = new HashSet<Integer>();
		integers.add(new Integer(5));

		numElementsInCommon(strings, integers);

	}

	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}


	static int rawNumElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}


	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		//s1.add("selam");
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}
}
