package commons;

import java.util.ArrayList;

public class Note extends Sound{
	
	
	public Note(int a){
		notes = new ArrayList<Integer>();
		notes.add(a);
	}
	
	public Note(int a, double d){
		notes = new ArrayList<Integer>();
		notes.add(a);
		duration = d;
	}
	
	public Note(){

	}
	
	
}