package models;

import java.util.ArrayList;
import java.util.List;

// Class defining the streets
public class Street {
	// Name of the street
	private String name;
	// Breakpoints on the street
	private List<Segment> streetSegments = new ArrayList<Segment>();

	// Constructor
	public Street(String name, List<Segment> breakPoints) {
		super();
		this.name = name;
		this.streetSegments = breakPoints;
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

	/**
	 * @return the streetSegments
	 */
	public List<Segment> getStreetSegments() {
		return streetSegments;
	}

	/**
	 * @param streetSegments the streetSegments to set
	 */
	public void setStreetSegments(List<Segment> streetSegments) {
		this.streetSegments = streetSegments;
	}

	// Setters and Getters
	
}
