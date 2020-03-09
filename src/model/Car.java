package model;

import processing.core.PImage;

public class Car {
	
	private PImage image;
	private String brand;
	private String name;
	
	public Car(PImage image,String brand,String name) {
		this.image = image;
		this.brand = brand;
		this.name = name;
	}

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
