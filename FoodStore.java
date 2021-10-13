package com.bl.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

 //data layer//model layer
public class FoodStore implements foodMethodInterface{
	private static FoodStore instance;
	private List<FoodItem> foodList = new ArrayList();
	
	private FoodStore() {
		
	}
	
	public static synchronized FoodStore getInstance(){
		if( instance == null) {
			instance = new FoodStore();
		}
		return instance;
	}
	
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}
	
	public List<FoodItem> getFoodList() {
		return foodList;
	}
	
	public void remove(FoodItem foodItem) {
		foodList.remove(foodItem);
	}
	
	public FoodItem getFood (String foodName) {
//		for (FoodItem foodItem : foodList ){
//			if(foodName.equals(foodItem.name)) {
//				return foodItem;
//			}
//		}
//		return null;
		return foodList.stream().filter(foodItem -> foodName.equals(foodItem.name)).
		 findFirst().orElse(null);

	} 
}
