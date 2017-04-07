Chord maj7(Note r){
	return Chord (r, r + 4, r + 7, r + 11);
}

Chord maj(Note r){
	return Chord (r, r + 4, r + 7);
}

Chord minadd13(Note r){
	return Chord (r, r + 3, r + 7, r + 9);
}

Chord min(Note r){
	return Chord (r, r + 3, r + 7);
}

Chord dom7(Note r){
	return Chord (r, r + 4, r + 7, r + 10);
}

Chord dim7(Note r){
	return Chord (r, r + 3, r + 6, r + 9);
}

void main(){

	Speed 120;
	Beat 4:4;

	Melody Lead = Melody(Gb3.8 A3.8 E4.4 E4.16 D4.16 E4.16 D4.16 D.4 Gb3.8 A3.8 Gb4.4 Gb4.16 E4.16 Gb.16 E4.16 E4.8 D4.8 B4.8 A4.16 A4.8 G4.8* B4.8 A4.16 A4.8 G4.8* B4.8 A4.16 A4.8 G4.8 E4.8 Quiet.16 D4.8 D4.8 C#5.8 C#5.16 A4.8 A4.8 Gb4.8 E4.4 E.16 D4.8 C#5.8 C#5.16 A4.8 A4.8 Gb4.8 E4.8 Gb4.4 Gb.16 D5.8 Db5.16 D5.8 Db5.8 D5.8 Db5.8 D5.8 A5.2*);
	Melody Chords = Melody (Quiet.4 maj7(D1).1 maj(G1).2 minad13(G1).2 maj7(D1).1 maj(G1).2 minad13(G1).2 min(bG1).2 maj(G1).2 min(Gb1).2 min(B1).2 dim7(Ab1).1 dom7(A).1);

	Poli { Voice MyLead Lead | Voice MyChords Chords};
}
