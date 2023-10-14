package models;

import java.util.List;

public class Street {
	private String name;
	private String segment;
	private List<Coordinates> breakPoints;
	
	public Street(String name, String segment, List<Coordinates> breakPoints) {
		super();
		this.name = name;
		this.segment = segment;
		this.breakPoints = breakPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public List<Coordinates> getBreakPoints() {
		return breakPoints;
	}

	public void setBreakPoints(List<Coordinates> breakPoints) {
		this.breakPoints = breakPoints;
	}
	
	
}
