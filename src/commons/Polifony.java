package commons;

import java.util.ArrayList;

public class Polifony{
	
	public ArrayList< Melody > voices;
	
	public Polifony(  ArrayList< Melody> v){
		voices = v;
	}
	
	public Polifony(Polifony p){
		voices = new ArrayList< Melody >(p.voices);
	}
	
	public Polifony(){
		voices = new  ArrayList< Melody >();
	}

	public void raisePitch(int x) {
		for (int i = 0; i < voices.size(); ++i){
			voices.get(i).raisePitch(x);
		}
	}
	
	public ArrayList<Melody> getVoices(){
		return voices;
	}
	
	@Override
	public String toString(){
		String r = "";
		for(int i = 0; i < voices.size(); ++i){
			r += voices.get(i).toString();
			if ( i <= voices.size()-1) r += " , ";
		}
		return "Poli( " + r + " )";
	}
}