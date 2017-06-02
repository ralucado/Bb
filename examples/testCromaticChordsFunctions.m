function foo(Note Anote, int i){
	MyChord = Chord(Anote(+i), Anote(+i+4), Anote(+i+7));
	MyChord.8;
}

function main(){
	Speed 60;
	Instrument 2;
	Vol 120;
	Aux = Note C 3;
	for (i = 24; i > 0; i = i - 2){
		Aux(+i).8;
		foo( Aux, i-1 );
	};
}