package CH07;

public class sub1 {
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {return hour;}
	public int getMunute() {return minute;}
	public float getSecond() {return second;}
	
	public void setHour(int h) {
		if (h< 0 || h>23) return;
		hour = h;
		
	}
	public void setminute(int m) {
		if (m< 0 || m>23) return;
		minute = m;
	}
	public void setSecond(float s) {
		if (s< 0.0f || s>59.99f) return;
		second = s;
		}
}	







 