function maj7( Note Rr, int l){
    (Rr, Rr (+ 4), Rr (+ 7), Rr (+ 11)).(l);
}

function dom7( Note Rr, int l){
	(Rr, Rr (+ 4), Rr (+ 7), Rr (+ 10)).(l);
}

function min7( Note Rr, int l){
	(Rr, Rr (+ 3), Rr (+ 7), Rr (+ 10)).(l);
}

function main(){

    Speed 220;
    Instrument 60;
    Vol 80;
    maj7( Note B 4,2);
    dom7( Note D 4, 2);
    maj7( Note G 3, 2);
    dom7( Note B b 2, 2);
    maj7( Note E b 3, 1);
    min7( Note A , 2);
    dom7( Note D , 2);
    maj7( Note G , 2);
    dom7( Note B b , 2);
    maj7( Note E b , 2);
    dom7( Note F# , 2);
    maj7( Note B , 1);
    min7( Note F , 3);
    dom7( Note B b , 3);
    maj7( Note E b , 1);
    min7( Note A , 3);
    dom7( Note D , 3);
    maj7( Note G , 1);
    min7( Note C# , 3);
    dom7( Note F# , 3);
    maj7( Note B , 1);
    min7( Note F , 3);
    dom7( Note B b , 3);
    maj7( Note E b , 1);
    min7( Note C# , 2);
    dom7( Note F# , 2);
}