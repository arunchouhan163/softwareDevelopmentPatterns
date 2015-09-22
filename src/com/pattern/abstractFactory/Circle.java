package com.pattern.abstractFactory;

public class Circle implements Shape {

	int radius=0;
	
	@Override
	public boolean draw() {
		if(this.radius>2){
			return true;
		}
		return false;
	}

	@Override
	public double area() {
		return this.radius*this.radius*(22/7);
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
