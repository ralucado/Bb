package commons;

import java.util.ArrayList;

public class Melody{
	
	private ArrayList<Sound> sounds;
	
	public Melody(ArrayList<Sound> s){
		sounds = s;
	}
	
	public Melody(){
		sounds = new ArrayList<Sound>();
	}
	
	//Copy contructor
	public Melody(Melody m) {
		sounds = new ArrayList<Sound>(m.sounds);
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
		assert sounds.size() > 0;
		return sounds.get(0).getInstrument();
	}

	public void raisePitch(int x) {
		for(int i = 0; i < sounds.size(); ++i){
			sounds.get(i).raisePitch(x);
		}
	}
	
	@Override
	public String toString(){
		String r = "";
		for (int i = 0; i < sounds.size(); ++i){
			r += sounds.get(i).toString();
			if( i < sounds.size()-1 ) r += " , ";
		}
		
		return "Melody( " + r + " )"; 
		
	}
		
	
}
