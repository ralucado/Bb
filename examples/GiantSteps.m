function maj7(Note r){
	return (r, r + 4, r + 7, r + 11);
}

function dom7(Note r){
	return (r, r + 4, r + 7, r + 10);
}

function min7(Note r){
	return (r, r + 3, r + 7, r + 10);
}

function main(){

	Beat 4:4;

    Speed 250;
    
	Melody chords = Melody(maj7(B).2 dom7(D).2 maj7(G).2 dom7(bB).2 maj7(bE).1 min7(A).2 dom7(D).2 maj7(G).2 dom7(bB).2 maj7(bE).2 dom7(#F).2 maj7(B).1 min7(F).2 dom7(bB).2 maj7(bE).1 min7(A).2 dom7(D).2 maj7(G).1 min7(#C).2 dom7(#F).2 maj7(B).1 min7(F).2 dom7(bB).2 maj7(bE).1 min7(#C).2 dom7(#F).2) ;
}
