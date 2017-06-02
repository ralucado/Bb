
import commons.*;
import java.util.*;

import javax.sound.midi.MidiSystem;

import midicompiler.*;
import java.io.*;


//C3 -> 0x3C
//D3 -> 0x3D
//E3 -> 0x3F
//F3 -> 0x40
//G3 -> 0x42
//A3 -> 0x44
//B3 -> 0x46
//C4 -> 0x47

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		n.add(0x3F - 12);
		n.add(0x3F - 12 + 4);
		n.add(0x3F - 12 + 7);
		n.add(0x3F - 12 + 11);
		Chord Emaj7 = new Chord(n, 4);

		n = new ArrayList<Integer>();
		
		n.add(0x45 - 12);
		n.add(0x45 - 12 + 2);
		n.add(0x45 - 12 + 6);
		n.add(0x45 - 12 + 10);
		Chord BlackadderBb = new Chord(n, 4);

		n = new ArrayList<Integer>();
		
		n.add(0x44 - 12);
		n.add(0x44 - 12 + 4);
		n.add(0x44 - 12 + 7);
		n.add(0x44 - 12 + 11);
		Chord Amaj7 = new Chord(n, 4);
		
		n = new ArrayList<Integer>();
		
		n.add(0x3D - 12);
		n.add(0x3D - 12 + 4);
		n.add(0x3D - 12 + 7);
		n.add(0x3D - 12 + 11);
		Chord Dmaj7 = new Chord(n, 4);		
		
		ArrayList<Pair<Data, Double>> d = new ArrayList<Pair<Data, Double>>();
		
		d.add(new Pair(new Data(Emaj7),120.0));
		d.add(new Pair(new Data(BlackadderBb),120.0));
		d.add(new Pair(new Data(Amaj7),120.0));
		d.add(new Pair(new Data(Dmaj7),120.0));

		ArrayList<Sound> as = new ArrayList<Sound>();
		
		as.add(Emaj7);
		as.add(BlackadderBb);
		as.add(Amaj7);
		as.add(Dmaj7);
		
		Melody m = new Melody(as, 0x45);
		
		d.add(new Pair(new Data(m),100.0));
		
		Note note1 = new Note(0x3C, 3);
		Note note2 = new Note(0x3F, 3);
		Note note3 = new Note(0x44, 0.5);
		Note note4 = new Note(0x4E, 3);
		
		ArrayList<Sound> a = new ArrayList<Sound>();
		
		a.add(note1);
		a.add(note2);
		a.add(note3);
		a.add(note4);
		
		ArrayList<Melody> mp = new ArrayList<Melody>();
		mp.add(m);
		mp.add(new Melody(a,0x20));
		
		Polifony p = new Polifony(mp);
		
		d.add(new Pair(new Data(p),130.0));
		d.add(new Pair(new Data(Emaj7), 100.0));
		
		File f = new File("midifile.mid");
		try{
			Player player = new Player();
			MidiSystem.write(player.writeMidi(d),1,f);
		}catch(Exception e){
			System.out.println("Exception caught " + e.toString());
		}
	}

}
