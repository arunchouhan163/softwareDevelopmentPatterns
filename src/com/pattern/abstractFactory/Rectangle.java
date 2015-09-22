package com.pattern.abstractFactory;

public class Rectangle implements Shape {

	private int width=0;
	private int height=0;
	@Override
	public boolean draw() {
		if(this.width!=this.height)
			return true;
		return false;
	}

	@Override
	public double area() {
		return this.height*this.width;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


}
