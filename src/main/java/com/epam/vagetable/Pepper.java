/**
 * 
 */
package com.epam.vagetable;

/**
 * @author Viktoriia_Havryliuk
 * 
 */
public class Pepper implements Vegetable {

	final double PEPPER_FAT = 10;
	final double PEPPER_PROTEIN = 15;
	final double PEPPER_CARBOHYDRATES = 30;
	double pesticides = 0.11;
	double weight;

	public Pepper(double weight) {
		this.weight = weight;
	}

	// returns count of calories with considering percentage of pesticides

	public double calcCalories() {
		double calories = (PEPPER_FAT + PEPPER_PROTEIN + PEPPER_CARBOHYDRATES)
				* pesticides;
		return calories;
	}

	// returns weight of pepper

	public double getWeight() {
		return weight;
	}

}
