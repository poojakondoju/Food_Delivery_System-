package com.bl.fooddeliverysystem;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

//controller layer
public class Application {
	UserInterface userInterface = new UserInterface();

	public static void main(String[] args) {
		/*
		 * ChineseCuisine chineseCuisine = new ChineseCuisine();
		 * chineseCuisine.setPrice(100); FrenchCuisine frenchCuisine = new
		 * FrenchCuisine(); frenchCuisine.setPrice(200); IndianCuisine indianCuisine =
		 * new IndianCuisine(); indianCuisine.setPrice(300); ItalianCuisine
		 * italianCuisine = new ItalianCuisine(); italianCuisine.setPrice(400);
		 * 
		 * FoodStore foodStore=new FoodStore();
		 * 
		 * foodStore.add(chineseCuisine); foodStore.add(indianCuisine);
		 * foodStore.add(italianCuisine); foodStore.add(frenchCuisine);
		 * 
		 * UserInterface userInterface = new UserInterface();
		 * userInterface.print(foodStore.getFoodList());
		 * 
		 * foodStore.remove(chineseCuisine); foodStore.remove(indianCuisine);
		 * 
		 * System.out.println("After removing items:");
		 * userInterface.print(foodStore.getFoodList());
		 */

		UserInterface userInterface = new UserInterface();
		userInterface.showUserMenu();
	}

	public void handleUserSelection(int n) {
		FoodStore foodStore = FoodStore.getInstance();

		switch (n) {
		case 1:
			FoodItem foodItem1 = userInterface.createfoodItems();
			foodStore.add(foodItem1);
			break;

		case 2:
			System.out.println("Enter names of food item to be removed:");
			Scanner sc = new Scanner(System.in);
			String foodName = sc.nextLine();
			FoodItem foodItem = foodStore.getFood(foodName);
			foodStore.remove(foodItem);
			break;

		case 3:
			userInterface.print(foodStore.getFoodList());
			break;

		case 4:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter foodname you want to edit ");
			String foodName1 = sc1.nextLine();
			FoodItem foodItem2 = foodStore.getFood(foodName1);

			try {
				if (foodItem2 == null) {
					throw new NoSuchElementException();
				} else {
					userInterface.editItem(foodItem2);
				}
			} catch (NoSuchElementException e) {
				System.out.println("Item not present in the list!");
			}
			break;

		}
	}
}
