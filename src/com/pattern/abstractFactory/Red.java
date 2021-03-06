package com.pattern.abstractFactory;

public class Red implements Color {

	private int availableQuantity=3;
	@Override
	public boolean fillColor() {
		if (this.availableQuantity>=0)
			return true;
		return false;
	}
	/**
	 * @return the availableQuantity
	 */
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
}
