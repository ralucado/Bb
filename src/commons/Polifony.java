package commons;

import java.util.ArrayList;

public class Polifony{
	
	public ArrayList< Melody > voices;
	
	public Polifony(  ArrayList< Melody> v){
		voices = v;
	}
	
	public Polifony(){
		voices = new  ArrayList< Melody >();
	}
	
}