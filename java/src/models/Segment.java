package models;

public class Segment {
	private Coordinates start;
	private Coordinates finish;
	
	public Segment(Coordinates start, Coordinates finish) {
		super();
		this.start = start;
		this.finish = finish;
	}
	
	public Segment(int x1, int y1, int x2, int y2) {
		super();
		this.start = new Coordinates(x1,y1);
		this.finish = new Coordinates(x2,y2);
	}
	
	/**
	 * @return the start
	 */
	public Coordinates getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Coordinates start) {
		this.start = start;
	}
	/**
	 * @return the finish
	 */
	public Coordinates getFinish() {
		return finish;
	}
	/**
	 * @param finish the finish to set
	 */
	public void setFinish(Coordinates finish) {
		this.finish = finish;
	}
	
	
}
