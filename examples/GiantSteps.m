Chords maj7(Note r){
	return Chords (r, r + 4, r + 7, r + 11);
}

Chords dom7(Note r){
	return Chords (r, r + 4, r + 7, r + 10);
}

Chords min7(Note r){
	return Chords (r, r + 3, r + 7, r + 10);
}

Chords main(){

	Beat 4:4;

    Speed 250;
    
	Melody Chords = Melody(maj7(B).2 dom7(D).2 maj7(G).2 dom7(Bb).2 maj7(Eb).1 min7(A).2 dom7(D).2 maj7(G).2 dom7(Bb).2 maj7(Eb).2 dom7(F#).2 maj7(B).1 min7(F).2 dom7(Bb).2 maj7(Eb).1 min7(A).2 dom7(D).2 maj7(G).1 min7(C#).2 dom7(F#).2 maj7(B).1 min7(F).2 dom7(Bb).2 maj7(Eb).1 min7(C#).2 dom7(F#).2) ;
}
