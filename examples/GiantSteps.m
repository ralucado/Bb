Chord maj7(Note Rr){
	return Chord(Rr, Rr (+ 4), Rr (+ 7), Rr (+ 11));
}

Chord dom7(Note Rr){
	return Chord(Rr, Rr (+ 4), Rr (+ 7), Rr (+ 10));
}

Chord min7(Note Rr){
	return Chord(Rr, Rr (+ 3), Rr (+ 7), Rr (+ 10));
}

void main(){

    Speed 250;
    
	Melody Chords = Melody(maj7(B).2 dom7(D).2 maj7(G).2 dom7(bB).2 maj7(bE).1 min7(A).2 dom7(D).2 maj7(G).2 dom7(bB).2 maj7(bE).2 dom7(#F).2 maj7(B).1 min7(F).2 dom7(bB).2 maj7(bE).1 min7(A).2 dom7(D).2 maj7(G).1 min7(#C).2 dom7(#F).2 maj7(B).1 min7(F).2 dom7(bB).2 maj7(bE).1 min7(#C).2 dom7(#F).2) ;
}