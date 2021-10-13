package com.bl.fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

//view layer
public class UserInterface {

	public void print(List<FoodItem> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i) + "\n");
		}
	}

	public FoodItem createfoodItems() {
		FoodItem foodItem = new FoodItem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Food item you want to add");
		foodItem.name = sc.nextLine();
		System.out.println("Enter 1: SWEET \n 2: SOUR \n 3: SPICY \n 4: SWEET_SOUR");
		int tasteUserInput = sc.nextInt();

		switch (tasteUserInput) {
		case 1:
			foodItem.setTaste(FoodItem.Taste.SWEET);
			break;
		case 2:
			foodItem.setTaste(FoodItem.Taste.SOUR);
			break;
		case 3:
			foodItem.setTaste(FoodItem.Taste.SPICY);
			break;
		case 4:
			foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
			break;
		}

		System.out.println("Enter 1: STARTER \n 2: JUICES 3: MAINCOURSE \n 4: DESERTS");
		int categoryUserInput = sc.nextInt();
		switch (categoryUserInput) {
		case 1:
			foodItem.setCategory(FoodItem.Category.STARTER);
			break;
		case 2:
			foodItem.setCategory(FoodItem.Category.JUICES);
			break;
		case 3:
			foodItem.setCategory(FoodItem.Category.MAINCOURSE);
			break;
		case 4:
			foodItem.setCategory(FoodItem.Category.DESERTS);
			break;
		}

		System.out.println("Enter price of food item");
		foodItem.price = sc.nextInt();
		System.out.println("Enter 1: VEG \n 2: NON_VEG");
		int vegUserInput = sc.nextInt();

		switch (vegUserInput) {
		case 1:
			foodItem.setVegType(FoodItem.VegType.VEG);
			break;
		case 2:
			foodItem.setVegType(FoodItem.VegType.NON_VEG);
			break;
		}

		return foodItem;
	}

	public FoodItem editItem(FoodItem foodItem) {
		int flag = 1;
		FoodStore foodStore = FoodStore.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1: Name \n 2: Taste \n 3: Category \n 4: type \n 5: Price");
		int choice = sc.nextInt();

		while (flag == 1) {
			switch (choice) {
			case 1:
				System.out.println("Enter item name ");
				foodItem.name = sc.nextLine();
				break;

			case 2:
				System.out.println("Enter 1: SWEET \n 2: SOUR \n 3: SPICY \n 4: SWEET_SOUR");
				int tasteUserInput = sc.nextInt();

				switch (tasteUserInput) {
				case 1:
					foodItem.setTaste(FoodItem.Taste.SWEET);
					break;
				case 2:
					foodItem.setTaste(FoodItem.Taste.SOUR);
					break;
				case 3:
					foodItem.setTaste(FoodItem.Taste.SPICY);
					break;
				case 4:
					foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
					break;
				}
				break;

			case 3:
				System.out.println("Enter 1: STARTER \n 2: JUICES 3: MAINCOURSE \n 4: DESERTS");
				int categoryUserInput = sc.nextInt();
				switch (categoryUserInput) {
				case 1:
					foodItem.setCategory(FoodItem.Category.STARTER);
					break;
				case 2:
					foodItem.setCategory(FoodItem.Category.JUICES);
					break;
				case 3:
					foodItem.setCategory(FoodItem.Category.MAINCOURSE);
					break;
				case 4:
					foodItem.setCategory(FoodItem.Category.DESERTS);
					break;
				}
				break;

			case 4:
				System.out.println("Enter 1: VEG \n 2: NON_VEG");
				int vegUserInput = sc.nextInt();

				switch (vegUserInput) {
				case 1:
					foodItem.setVegType(FoodItem.VegType.VEG);
					break;
				case 2:
					foodItem.setVegType(FoodItem.VegType.NON_VEG);
					break;
				}
				break;

			case 5:
				System.out.println("Enter price of food item");
				int price = sc.nextInt();
				foodItem.setPrice(price);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			flag = 0;
		}
		System.out.println("Item Details Updated Successfully!");
		return foodItem;
	}

	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int exit = 5;
		Application application = new Application();

		while (n != exit) {
			System.out.println("----------------------------------------");
			System.out.println("WELCOME TO FOOD DELIVERY SYSTEM");
			System.out.println("----------------------------------------");
			System.out.println("Enter 1 for Adding food item ");
			System.out.println("Enter 2 for removing food item ");
			System.out.println("Enter 3 for displaying food item ");
			System.out.println("Enter 4 for editing food item");
			n = sc.nextInt();

			application.handleUserSelection(n);
		}
	}
}