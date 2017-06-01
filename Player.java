package midicompiler; //si se cambia el package cambiar esto

import javax.sound.midi.*;
import commons.*;
import java.util.ArrayList;
public class Player {
	
	private double bpm = 120;
	private byte[] setup = {(byte)0xF0, 0x7E, 0x7F, 0x09, 0x01, (byte)0xF7};
	private Sequence s;
	private int ticks = 24;
	private Track t;
	
	public Player(int b){
		try{
			s = new Sequence(javax.sound.midi.Sequence.PPQ,ticks);
			t = s.createTrack();
			
			//****  General MIDI sysex -- turn on General MIDI sound set  ****
			SysexMessage sm = new SysexMessage();
			sm.setMessage(setup, 6);
			MidiEvent me = new MidiEvent(sm,(long)0);
			t.add(me);
			
			setTempo(b);

			//****  set track name (meta event)  ****	
			MetaMessage mt = new MetaMessage();
			String TrackName = new String("midifile track");
			mt.setMessage(0x03 ,TrackName.getBytes(), TrackName.length());
			me = new MidiEvent(mt,(long)0);
			t.add(me);
			
			//****  set omni on  ****
			ShortMessage mm = new ShortMessage();
			mm.setMessage(0xB0, 0x7D,0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			//****  set poly on  ****
			mm = new ShortMessage();
			mm.setMessage(0xB0, 0x7F,0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			//****  set instrument to Piano by default ****
			mm = new ShortMessage();
			mm.setMessage(0xC0, 0x00, 0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught " + e.toString());
		} 
	}
	
	public Player(){
		try{
			s = new Sequence(javax.sound.midi.Sequence.PPQ,ticks);
			t = s.createTrack();
			
			//****  General MIDI sysex -- turn on General MIDI sound set  ****
			SysexMessage sm = new SysexMessage();
			sm.setMessage(setup, 6);
			MidiEvent me = new MidiEvent(sm,(long)0);
			t.add(me);
			
			setTempo(bpm);

			//****  set track name (meta event)  ****	
			MetaMessage mt = new MetaMessage();
			String TrackName = new String("midifile track");
			mt.setMessage(0x03 ,TrackName.getBytes(), TrackName.length());
			me = new MidiEvent(mt,(long)0);
			t.add(me);
			
			//****  set omni on  ****
			ShortMessage mm = new ShortMessage();
			mm.setMessage(0xB0, 0x7D,0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			//****  set poly on  ****
			mm = new ShortMessage();
			mm.setMessage(0xB0, 0x7F,0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			//****  set instrument to Piano by default ****
			mm = new ShortMessage();
			mm.setMessage(0xC0, 0x00, 0x00);
			me = new MidiEvent(mm,(long)0);
			t.add(me);

			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught " + e.toString());
		} 
	}
	
	private void setTempo(double b)throws InvalidMidiDataException  {
		bpm = b;
		// calcular bpm en microsegundos;
		Double duracion = 25 / bpm; //duracion de quarter note en segundos
		duracion *= 1000000;
		int duracionint = duracion.intValue();
		byte primerbyte = (byte) ((duracionint >> 16) & 0xFF);
		byte segundobyte = (byte) ((duracionint >> 8) & 0xFF);
		byte tercerbyte = (byte) ((duracionint) & 0xFF);
		MetaMessage mt = new MetaMessage();
        byte[] bt = {primerbyte, segundobyte, tercerbyte};
		mt.setMessage(0x51 ,bt, 3);
		MidiEvent me = new MidiEvent(mt,(long)0);
		t.add(me);

	}
	
	private int messageSound(int channel, Sound s, int start){
		int auxstart = start;
		if(channel >= 0 && channel < 16){

			Pair<Double, ArrayList<Integer>> sound = s.getSound();

			int duration = sound.getLeft().intValue();
			ArrayList<Integer> notes = sound.getRight();
			try{

				for(int i = 0; i < notes.size(); i++){
					if(notes.get(i) != -1){
					ShortMessage mm = new ShortMessage();
					mm.setMessage(0x90 | channel, notes.get(i), 0x60); // 0x90 es NOTE_ON, 0x3C es middle C
					MidiEvent me = new MidiEvent(mm,auxstart);
					t.add(me);
					}
				}

				auxstart += ticks*duration;

				for(int i = 0; i < notes.size(); i++){
					if(notes.get(i) != -1){
					ShortMessage mm = new ShortMessage();
					mm.setMessage(0x80 | channel, notes.get(i), 0x40); // 0x80 es NOTE_OFF, 0x3C es middle C
					MidiEvent me = new MidiEvent(mm,auxstart);
					t.add(me);
					}
				}
			}catch(Exception e){
				System.out.println("Exception caught " + e.toString());
			}		
		}
		return auxstart;
	}
	
	private int writeSounds(int channel, ArrayList<Sound> s, int start){
		
		int auxstart = start;
		
		for(int i = 0; i < s.size(); i++){
			auxstart = messageSound(channel, s.get(i), auxstart);
		}
		return auxstart;
	}
	
	private void setInstrument(int channel,int inst, int start){

		if(channel < 16 && channel >= 0){

			try{
				ShortMessage mm = new ShortMessage();
				mm.setMessage(0xC0 | channel, inst, 0x00);
				MidiEvent me = new MidiEvent(mm,start);
				t.add(me);
			}
			catch(Exception e){
				System.out.println("Exception caught " + e.toString());
			}
		}
	}
	
	private void setEnd(int end){
		try{
		MetaMessage mt = new MetaMessage();
        byte[] bet2 = {}; // empty array
		mt.setMessage(0x2F,bet2,0);
		MidiEvent me = new MidiEvent(mt, end);
		t.add(me);
		}			
		catch(Exception e){
			System.out.println("Exception caught " + e.toString());
		}
	}
	
	public Sequence writeMidi(ArrayList<Data> d){
		int start = 1;	
		for(int i = 0; i < d.size() ; ++i){

			Data.Type dtype = d.get(i).getType();
			
			switch(dtype){
			case NOTE:{
				Note n = d.get(i).getNoteValue();
				ArrayList<Sound> AuxSound = new ArrayList<Sound>();
				AuxSound.add(n);
				start = writeSounds(0, AuxSound, start);
				break;
			}
			case CHORD:{
				Chord c = d.get(i).getChordValue();
				ArrayList<Sound> AuxSound = new ArrayList<Sound>();
				AuxSound.add(c);
				start = writeSounds(0, AuxSound, start);
				break;
			}
			case MELODY:{
				Melody m = d.get(i).getMelodyValue();
				ArrayList<Sound> AuxSound = m.getSounds();
				int inst = m.getInstrument();
				setInstrument(0, inst, start);
				start = writeSounds(0, AuxSound, start);
				break;
			}
			case POLIFONY:{
				Polifony p = d.get(i).getPolifonyValue();
				ArrayList<Melody> v = p.getVoices();
				int maxstart = start;
				for(int j = 0; j < v.size();j++){
					setInstrument(j, v.get(j).getInstrument(), start);
					int auxstart = writeSounds(j, v.get(j).getSounds(),start);
					if(maxstart < auxstart){
						maxstart = auxstart;
					}
				}
				start = maxstart;
				break;
			}
			}
			
		}
		setEnd(start);
		return s;
	}
	
	
}
