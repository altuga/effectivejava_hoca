// Builder Pattern - Pages 14-15
package org.effectivejava.examples.chapter02.item02.kodcu.builder;

public class Serum {
	private final int water; //  required
	private final int sodiumIon; //  required
	private final int magnesium; // optional
	private final int creatine; // optional
	private final int globulin;  // optional
	private final int carbohydrate; // optional


	public static class Builder {
		// Required parameters
		private final int water;
		private final int sodiumIon;

		// Optional parameters - initialized to default values
		private int magnesium = 0;
		private int creatine = 0;
		private int globulin = 0;
		private int carbohydrate = 0;

		public Builder(int water, int sodiumIon) {
			this.water = water;
			this.sodiumIon = sodiumIon;
		}

		public Builder magnesium(int val) {
			magnesium = val;
			return this;
		}

		public Builder creatine(int val) {
			creatine = val;
			return this;
		}

		public Builder globulin(int val) {
			globulin = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Serum build() {
			return new Serum(this);
		}
	}

	private Serum(Builder builder) {
		water = builder.water;
		sodiumIon = builder.sodiumIon;
		magnesium = builder.magnesium;
		creatine = builder.creatine;
		globulin = builder.globulin;
		carbohydrate = builder.carbohydrate;
        System.out.println("Serum is created");
	}

	public static void main(String[] args) {
		Serum typeB = new Serum.Builder(240, 8)
				.magnesium(100).creatine(35).globulin(27).build();

		System.out.println(typeB.carbohydrate);
	}
}