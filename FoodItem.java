package com.bl.fooddeliverysystem;

public class FoodItem {
	enum Taste {SWEET, SOUR, SPICY, SWEET_SOUR};
	enum Category {STARTER, JUICES, MAINCOURSE, DESERTS};
	enum  VegType {VEG, NON_VEG};
	
	protected Taste taste;
	protected Category category;
	protected VegType vegType;
	public int price;
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTaste(Taste tasteUserInput) {
		this.taste = tasteUserInput;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", category=" + category + ", vegType=" + vegType + ", price=" + price
				+ ", name=" + name + "]";
	}

	public void setCategory(Category categoryUserInput) {
		this.category = categoryUserInput;
	}

	public void setVegType(VegType vegUserInput) {
		this.vegType = vegUserInput;
	}
	
}
