function maj7(Note r){
	return (r, r + 4, r + 7, r + 11);
}

function maj(Note r){
	return (r, r + 4, r + 7);
}

function minadd13(Note r){
	return (r, r + 3, r + 7, r + 9);
}

function min(Note r){
	return (r, r + 3, r + 7);
}

function dom7(Note r){
	return (r, r + 4, r + 7, r + 10);
}

function dim7(Note r){
	return (r, r + 3, r + 6, r + 9);
}

function main(){

	Beat 4:4;

	Melody lead = bSol3.8 La3.8 Mi4.4 Mi4.16 Re4.16 Mi4.16 Re4.16 Re.4 bSol3.8 La3.8 bSol4.4 bSol4.16 Mi4.16 bSol.16 Mi4.16 Mi4.8 Re4.8 Si4.8 La4.16 La4.8 Sol4.8* Si4.8 La4.16 La4.8 Sol4.8* Si4.8 La4.16 La4.8 Sol4.8 Mi4.8 Quiet.16 Re4.8 Re4.8 #Do5.8 #Do5.16 La4.8 La4.8 bSol4.8 Mi4.4 Mi.16 Re4.8 #Do5.8 #Do5.16 La4.8 La4.8 bSol4.8 Mi4.8 bSol4.4 bSol.16 Re5.8 bRe5.16 Re5.8 bRe5.8 Re5.8 bRe5.8 Re5.8 La5.2*;
	Melody chords = Quiet.4 for(int i = 0; i < 2; i++){maj7(Re1).1 maj(Sol1).2 minadd13(Sol1).2}  min(bSol1).2 maj(Sol1).2 min(bSol1).2 min(Si1).2 dim7(bLa1).1 dom7().1;
}
