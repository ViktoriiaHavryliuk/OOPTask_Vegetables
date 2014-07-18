package com.epam.main;

import java.util.Comparator;

import com.epam.vagetable.Vegetable;

public class Compare implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		if (v1.calcCalories() < v2.calcCalories())
			return -1;
		if (v1.calcCalories() > v2.calcCalories())
			return 1;
		return 0;
	}
}
