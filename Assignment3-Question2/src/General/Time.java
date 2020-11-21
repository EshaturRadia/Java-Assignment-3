package General;

public class Time {

	private int hours;
	private int mins;
	private String t;

	public Time() {
		
	}
	public Time(int hours, int mins, String t) {
		this.hours = hours;
		this.mins = mins;
		this.t = t;
	}

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
}
