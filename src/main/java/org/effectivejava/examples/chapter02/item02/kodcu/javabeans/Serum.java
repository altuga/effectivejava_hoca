// JavaBeans Pattern - allows inconsistency, mandates mutability - Pages 12-13
package org.effectivejava.examples.chapter02.item02.kodcu.javabeans;

public class Serum {
	// Parameters initialized to default values (if any)

	private  int water = 0; // (mL) required
	private  int sodiumIon = 0 ; //  required
	private  int magnesium = 0; // optional
	private int creatine = 0; // (g) optional
	private  int globulin = 0; // (mg) optional
	private  int carbohydrate = 0; // (g) optional


	public Serum() {
	}

	// Setters

	public void setWater(int water) {
		this.water = water;
	}

	public void setSodiumIon(int sodiumIon) {
		this.sodiumIon = sodiumIon;
	}

	public void setMagnesium(int magnesium) {
		this.magnesium = magnesium;
	}


	public void setCreatine(int creatine) {
		this.creatine = creatine;
	}


	public void setGlobulin(int globulin) {
		this.globulin = globulin;
	}


	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		Serum typeB = new Serum();
		typeB.setWater(240);
		typeB.setSodiumIon(8);
		typeB.setMagnesium(100);
		typeB.setCreatine(35);
		typeB.setCarbohydrate(27);
	}

}