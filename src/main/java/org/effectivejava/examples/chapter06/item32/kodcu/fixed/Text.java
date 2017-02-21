// EnumSet - a modern replacement for bit fields - Page 160
package org.effectivejava.examples.chapter06.item32.kodcu.fixed;

import java.util.EnumSet;
import java.util.Set;

public class Text {
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
	}

	// Any Set could be passed in, but EnumSet is clearly best
	public void applyStyles(Set<Style> styles) {
		// Body goes here
	}

	// Sample use
	public static void main(String[] args) {
		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
}
