package models;

import java.util.ArrayList;
import java.util.List;

// Class defining the streets
public class Street {
	// Name of the street
	private String name;
	// Breakpoints on the street
	private List<Coordinates> breakPoints = new ArrayList<Coordinates>();

	// Constructor
	public Street(String name, List<Coordinates> breakPoints) {
		super();
		this.name = name;
		this.breakPoints = breakPoints;
	}

	// Setters and Getters
	/**
	 * @return the name of the street
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name of the street to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Street breakPoints as list
	 */
	public List<Coordinates> getBreakPoints() {
		return breakPoints;
	}

	/**
	 * @param breakPoints the breakPoints to set
	 */
	public void setBreakPoints(List<Coordinates> breakPoints) {
		this.breakPoints = breakPoints;
	}

	public List<Coordinates> getSegment(int segment) {
		List<Coordinates> segmentCoordinates = new ArrayList<Coordinates>();

		if (segment >= 0 && segment < this.breakPoints.size() - 1) {
			segmentCoordinates.add(this.breakPoints.get(segment - 1));
			segmentCoordinates.add(this.breakPoints.get(segment));
		} else {
			return null;
		}

		return segmentCoordinates;
	}

}
