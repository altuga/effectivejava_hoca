package org.effectivejava.examples.chapter04.item17.kodcu.questions;

public class Super {
	// Broken - constructor invokes an overridable method
	public Super() {
		overrideMe();
	}

	public void overrideMe() {
	}
}
