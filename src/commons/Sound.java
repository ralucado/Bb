package commons;

import java.util.ArrayList;

public abstract class Sound{
	
	protected ArrayList<Integer> notes = new ArrayList<Integer>();

	protected double duration = 0.0;
	
	protected int instrument = 0;
	
	protected int volume = 0;
	
	public ArrayList<Integer> getPitch() {
		return notes;
		
	}
	
	public void raisePitch(int x){
		for(int i = 0; i < notes.size(); ++i){
			notes.set(i, notes.get(i)+x);
		}
	}
	
	public Pair<Double, ArrayList<Integer>> getSound(){
		return new Pair<Double, ArrayList<Integer> >(duration, notes);
	}
	
	public int getInstrument(){
		return instrument;
	}
	
	public void setInstrument(int i){
		instrument = i;
	}
	
	public double getDuration(){
		return duration;
	}
	
	public boolean hasDuration(){
		return duration != 0;
	}
	
	public void setDuration(double d){
		duration = d;
	}

	public void setVolume(int vol) {
		volume = vol;
	}
	
	public int getVolume(){
		return volume;
	}
}
