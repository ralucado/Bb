function main(){
	Speed 60;
	Instrument 2;
	Vol 120;
	Aux = Note A;
	Aux2 = Note A#2;
	Patata = Chord(C, E, G);
	Min = Chord(C, E b, G);
	a = 3;
	Shooting = Melody(1 Z.4 Aux(+1*3-5).4 (C,E b 4,G).2* F 4.4* [Patata(+1),Patata,Patata(+3)].4*);
	MyPoli = Poli {
		Melody(15 [A 3,B 3,C 3,D 3,E 3,F 3,G 3,A 3,B 3,C 3].16*) |
		Melody(40 [A 4,B 4,C 4,D 4,E 4,F 4,G 4,A 4,B 4,C 4].16*) |
	};
	/*int i = 0;	
	while(i < 8){
		if(i % 2 = 0) {
			Aux.8;
			Z.8;
		};
		i = i + 1;
	};*/
	Lol = Chord(Aux, Aux(+a), Aux2(+7));
	//Shooting;
	MyPoli;
	//Lol.4*;
}
