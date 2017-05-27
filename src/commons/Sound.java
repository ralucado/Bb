package commons;

import java.util.ArrayList;

public abstract class Sound{
	
	protected ArrayList<Integer> notes = new ArrayList<Integer>();

	protected Double duration = (double) 0;
	
	public ArrayList<Integer> getPitch() {
		return notes;
		
	}
	
	public Pair<Double, ArrayList<Integer>> getSound(){
		return new Pair<Double, ArrayList<Integer> >(duration, notes);
	}
	
	public double getDuration(){
		return duration;
	}
	
	public boolean hasDuration(){
		return duration != 0;
	}
}
