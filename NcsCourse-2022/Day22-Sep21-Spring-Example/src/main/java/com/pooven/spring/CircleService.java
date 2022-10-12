package com.pooven.spring;


public class CircleService {
	
	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
	public void draw() {
		circle.draw();
	}

}
