package commons;

import java.util.ArrayList;

public class Chord extends Sound{
	
	public Chord(ArrayList<Integer> a){
		notes = a;
	}
	
	public Chord(ArrayList<Integer> a, double d, int i){
		notes = a;
		duration = d;
		instrument = i;
	}
	
	public Chord(){
	}
	
	@Override
	public String toString(){
		String r = "";
		for ( int i = 0; i < notes.size(); ++i){
			r = r + notes.get(i).toString();
			if ( i < notes.size()-1) r += " , ";
		}
		return "Chord( " + r + " -> " + Double.toString(duration) + " )";

	}
	
}