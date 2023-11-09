package models;
// Class to define the coordinates for each break point on every street

public class Coordinates {
	// Points in space
	protected int x;
	protected int y;

	// Constructor
	public Coordinates(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Setters and Getters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}