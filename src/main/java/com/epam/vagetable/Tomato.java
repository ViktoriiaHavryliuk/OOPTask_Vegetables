/**
 * 
 */
package com.epam.vagetable;

/**
 * @author Viktoriia_Havryliuk
 * 
 */
public class Tomato implements Vegetable {

	final double TOMATO_FAT = 15;
	final double TOMATO_PROTEIN = 5;
	final double TOMATO_CARBOHYDRATES = 70;
	double weight;

	public Tomato(double weight) {
		this.weight = weight;
	}

	// returns count of calories

	public double calcCalories() {
		double calories = TOMATO_FAT + TOMATO_PROTEIN + TOMATO_CARBOHYDRATES;
		return calories;
	}

	// returns weight of tomato

	public double getWeight() {
		return weight;
	}

}
