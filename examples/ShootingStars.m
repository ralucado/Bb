Chord maj(Note Ini){
	return (Ini, Ini+4, Ini+7);
}

Chord min(Note Ini){
	return (Ini, Ini+3, Ini+7);
}

void main(){

	Speed 160;

	Melody Lead = Melody(bMi.4* bMi.8 Mi.8 Quiet.8 Si.8* #Sol.16);
    Melody Chords = Melody(maj(Mi1).1 maj(Mi1).1 min(#Do1).1 min(#Do1).1 min(#Sol1).1 min(#Sol1).1 maj(Si1).1 maj(Si1).1);

	for(i = 0; i < 4; i=i+1){
		Lead;
		Chords;
	}
}
