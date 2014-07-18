/**
 * 
 */
package com.epam.main;

import java.util.*;

import com.epam.vagetable.Cocumber;
import com.epam.vagetable.Pepper;
import com.epam.vagetable.Tomato;
import com.epam.vagetable.Vegetable;

/**
 * @author Viktoriia_Havryliuk
 * 
 */
public class SaladMaker {

	private List<Vegetable> salad = new ArrayList<>();

	public List<?> getSalad() {
		return salad;
	}

	public void add(Vegetable v) {
		salad.add(v);
	}

	// collect a new salad
	public void saladMaker(int qtyOfVegitables) {
		salad.clear();
		for (int i = 0; i < qtyOfVegitables; i++) {
			int randomNumber = (int) (Math.random() * 3);
			switch (randomNumber) {
			case 0: {
				salad.add(new Tomato(100));
				break;
			}
			case 1: {
				salad.add(new Cocumber(100));
				break;
			}
			case 2: {
				salad.add(new Pepper(100));
				break;
			}
			default:
				break;
			}
		}
	}

	// count calories of salad
	public double getCalories() {
		double sumCalories = 0;
		for (Vegetable v : salad) {
			sumCalories += v.calcCalories();
		}
		return sumCalories;
	}
	
	// sort ArrayList
	public void sortVegitables() {
		Compare comp = new Compare();
		Collections.sort(salad, comp);
	}
	
	// find vegetable from range
	public Vegetable findVegitable(double min, double max){
		if (salad!= null){
			for (Vegetable v: salad){
				if(v.calcCalories()>min && v.calcCalories()<max){
					return v;
				}
			}
		}
		return null;		
	}
}
