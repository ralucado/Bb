/*function foo(Note Anote, int i){
	MyChord = Chord(Anote(+i), Anote(+i+4), Anote(+i+7));
	MyChord.8;
}*/

function main(){
	Speed 60;
	Instrument 2;
	Vol 120;
	Aux = Note C 3;
	Melo = Melody(1 [Aux,Aux(+1),Aux(+2),Aux(+3),Aux(+4),Aux(+5)].8);
	Melo;
}