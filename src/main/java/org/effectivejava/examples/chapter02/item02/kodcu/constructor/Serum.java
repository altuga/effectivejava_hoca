package org.effectivejava.examples.chapter02.item02.kodcu.constructor;

public class Serum {
	private final int water; // (mL) required
	private final int sodiumIon; // required
	private final int magnesium; // optional
	private final int creatine; // (g) optional
	private final int globulin; // (mg) optional
	private final int carbohydrate; // (g) optional

	public Serum(int water, int sodiumIon) {
		this(water, sodiumIon, 0);
	}

	public Serum(int water, int sodiumIon, int magnesium) {
		this(water, sodiumIon, magnesium, 0);
	}

	public Serum(int water, int sodiumIon, int magnesium, int creatine) {
		this(water, sodiumIon, magnesium, creatine, 0);
	}

	public Serum(int water, int sodiumIon, int magnesium, int creatine,
				 int globulin) {
		this(water, sodiumIon, magnesium, creatine, globulin, 0);
	}

	public Serum(int water, int SodiumIon, int magnesium, int creatine,
				 int globulin, int carbohydrate) {
		this.water = water;
		this.sodiumIon = SodiumIon;
		this.magnesium = magnesium;
		this.creatine = creatine;
		this.globulin = globulin;
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		Serum aType = new Serum(240, 8, 100, 0, 35, 27);
	}
}