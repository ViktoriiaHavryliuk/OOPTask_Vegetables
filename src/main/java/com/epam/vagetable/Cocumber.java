/**
 * 
 */
package com.epam.vagetable;

/**
 * @author Viktoriia_Havryliuk
 * 
 */
public class Cocumber implements Vegetable {

	final double COCUMBER_FAT = 15;
	final double COCUMBER_PROTEIN = 5;
	final double COCUMBER_CARBOHYDRATES = 70;
	double pesticides = 0.2;
	double weight;

	public Cocumber(double weight) {
		this.weight = weight;
	}

	// returns count of calories with considering percentage of pesticides

	public double calcCalories() {
		double calories = (COCUMBER_FAT + COCUMBER_PROTEIN + COCUMBER_CARBOHYDRATES)
				* pesticides;
		return calories;
	}

	// returns weight of tomato

	public double getWeight() {
		return weight;
	}

}
