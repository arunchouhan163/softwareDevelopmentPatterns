package com.pattern.abstractFactory;

public interface Shape {
	
	/**
	 * It returns whether the draw was successfull or not
	 * @return
	 */
	public boolean draw();
	
	/**
	 * It returns the area of the shape
	 * @return
	 */
	public double area();

}
