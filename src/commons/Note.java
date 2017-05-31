package commons;

import java.util.ArrayList;

public class Note extends Sound{
	
	
	public Note(int a){
		notes = new ArrayList<Integer>();
		notes.add(a);
	}
	
	public Note(int a, double d, int i){
		notes = new ArrayList<Integer>();
		notes.add(a);
		duration = d;
		instrument = i;
	}
	
	public Note(){

	}
	@Override
	public String toString(){
		return "Note( "+notes.get(0).toString()+" -> " + Double.toString(duration) + " )";
		
	}
	
	
}