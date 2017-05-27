package commons;

import java.util.ArrayList;

public class Chord extends Sound{
	
	public Chord(ArrayList<Integer> a){
		notes = a;
	}
	
	public Chord(ArrayList<Integer> a, double d){
		notes = a;
		duration = d;
	}
	
	public Chord(){
	}
	
	
}