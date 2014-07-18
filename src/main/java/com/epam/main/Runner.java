/**
 * 
 */
package com.epam.main;

import java.util.Scanner;

import com.epam.vagetable.Vegetable;

/**
 * @author Viktoriia_Havryliuk
 * 
 */
public class Runner {

	SaladMaker salad = new SaladMaker();
	Scanner in = new Scanner(System.in);

	public void start() {

		while (true) {
			System.out.println("Enter 1 or 2 or 3 to collect gift");
			int digit = 0;
			digit = readInt();
			switch (digit) {
			case 1: {
				makeSalad();
				break;
			}
			case 2: {
				sortSalad();
				break;
			}
			case 3: {
				findVegetable();
				break;
			}
			default: {
				System.out.println("Invalid input!");
				break;
			}
			}
			System.out.println();
			System.out.println("Would you like to start over? (Y/N)");

			String startOver = in.nextLine();
			if ("N".equals(startOver) || "n".equals(startOver)) {
				System.out.println("Bye!");
				in.close();
				break;
			}
		}
	}

	private int readInt() {
		int num = 0;
		while (true) {
			try {
				num = Integer.parseInt(in.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong!Can you enter a new number?");
				System.out.println("Enter one of proposed integer number!");
				continue;
			}
		}
		return num;
	}

	private void makeSalad() {
		System.out.println("Enter qty of vegetables");
		int qtyOfVegitables = 0;
		qtyOfVegitables = readInt();
		salad.saladMaker(qtyOfVegitables);
		System.out.println("Salad is made successful");
		System.out.println("Weight of salad is " + salad.getCalories());
	}

	private void sortSalad() {
		salad.sortVegitables();
		System.out.println("Salad is sorted!");
	}

	private void findVegetable() {
		System.out.println("Enter min range");
		double min = readDouble();
		System.out.println("Enter max range");
		double max = readDouble();

		Vegetable v = salad.findVegitable(min, max);
		if (v == null) {
			System.out.println("Object not found");
		} else {
			System.out.println(v.toString());
		}
	}

	private double readDouble() {
		double num = 0;
		while (true) {
			try {
				num = Double.parseDouble(in.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Wrong!Can you enter a new number?");
				System.out.println("Enter one of proposed double number!");
				continue;
			}
		}
		return num;
	}

}
