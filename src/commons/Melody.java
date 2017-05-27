package commons;

import java.util.ArrayList;

public class Melody{
	
	private ArrayList<Sound> sounds;
	private int instrument;
	
	public Melody(ArrayList<Sound> s, int i){
		sounds = s;
		setInstrument(i);
	}
	
	public Melody(){
		sounds = new ArrayList<Sound>();
		setInstrument(0);
	}
	
	public ArrayList<Sound> getSounds(){
		return sounds;
	}
	
	public void addSounds(ArrayList<Sound> newSounds){
		sounds.addAll(newSounds);
	}
	
	public void addSound(Sound newSound){
		sounds.add(newSound);
	}

	public int getInstrument() {
		return instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}


	public void raisePitch(int x) {
		for(int i = 0; i < sounds.size(); ++i){
			sounds.get(i).raisePitch(x);
		}
	}
		
	
}
