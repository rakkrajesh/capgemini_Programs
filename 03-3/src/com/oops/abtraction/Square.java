package com.oops.abtraction;

public class Square extends Rectangle {
	protected double side = 1.0;
	public Square(double side, double width, double length, double radius, String color, boolean filled) {
		super(width, length, radius, color, filled);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getWidth() {
		return getWidth();
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + ", getSide()=" + getSide() + ", getWidth()=" + getWidth() + "]";
	}
	
	
	
	
	
}
