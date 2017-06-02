function main(){
	Speed 60;
	Instrument 2;
	Vol 120;
	MyPoli = Poli {
		Melody(15 [A 3,B 3,C 3,D 3,E 3,F 3,G 3,A 3,B 3,C 3].16*) |
		Melody(40 [A 4,B 4,C 4,D 4,E 4,F 4,G 4,A 4,B 4,C 4].16*) |
	};
	MyPoli;
	Speed 60;
	Vol 30;
	MyPoli;
}
