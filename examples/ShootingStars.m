Chord maj(Note r){return (r, r+4, r+7);}

Chord min(Note r){
	return (r, r+3, r+7);
}

void main(){

	Speed 160;

	Melody lead = bMi.4* bMi.8 Mi.8 Quiet.8 Si.8* #Sol.16;
    Melody chords = maj(Mi1).1 maj(Mi1).1 min(#Do1).1 min(#Do1).1 min(#Sol1).1 min(#Sol1).1 maj(Si1).1 maj(Si1).1;

	for(i = 0; i < 4; i++){
		lead;
		chords;
	}
}
