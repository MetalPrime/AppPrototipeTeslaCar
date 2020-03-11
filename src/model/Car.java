package model;

import processing.core.PImage;

public abstract class Car {
	
	private PImage image;
	private String brand;
	private String name;
	private int price;
	private String description;
	private String context;
	
	public Car(PImage image,String brand,String name, int price, String description, String context) {
		this.image = image;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.description = description;
		this.context = context;
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	public abstract void shopping();
	
	public abstract void description();

	/**
	 * @return the image
	 */
	public PImage getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(PImage image) {
		this.image = image;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
